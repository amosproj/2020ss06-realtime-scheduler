package com.honeybadgers.realtimescheduler.services.impl;

import com.honeybadgers.models.Task;
import com.honeybadgers.realtimescheduler.repository.TaskPostgresRepository;
import com.honeybadgers.realtimescheduler.services.ITaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
@Slf4j
public class TaskService implements ITaskService {

    @Autowired
    TaskPostgresRepository taskPostgresRepository;

    @Value("${com.realtimescheduler.scheduler.priority.deadline-modifier}")
    double deadlineModifier;

    @Value("${com.realtimescheduler.scheduler.priority.deadline-bonus-base-prio-dependant}")
    boolean deadlineBaseDependant;

    @Override
    public List<Task> getAllTasks() {
        return taskPostgresRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(String id) {
        return taskPostgresRepository.findById(id);
    }

    @Override
    public void uploadTask(Task task) {
        taskPostgresRepository.save(task);
    }

    @Override
    public void deleteTask(String id) {
        this.taskPostgresRepository.deleteById(id);
    }

    @Override
    public long calculatePriority(Task task) {
        double finalPriority = 0;
        finalPriority = task.getPriority();
        Timestamp deadline = task.getDeadline();
        if(deadline != null){
            Date currentTime = new Date(System.currentTimeMillis());
            //timeDiff in Minuten umrechnen, da sonst Differenz zu klein (finalPriority ändert zu wenig)
            double timeDiff = Math.abs(deadline.getTime() - currentTime.getTime()) / (1000.0 * 60.0);
            log.info("timediff: " + timeDiff);
            if(deadlineBaseDependant) {
                // the higher the base-prio, the higher it will be increased by same timediff
                finalPriority += ((deadlineModifier * finalPriority) / timeDiff);
            } else {
                finalPriority += (deadlineModifier/timeDiff);
            }
        }
        return Math.round(finalPriority);
    }

}
