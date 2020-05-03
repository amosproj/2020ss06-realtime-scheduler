package com.honeybadgers.realtimescheduler.domain.jpa;

import com.honeybadgers.realtimescheduler.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "priority")
    private Integer taskPriority;

    private String name;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @CreationTimestamp
    private Timestamp submittimestamp;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "rt_task_role",
            joinColumns = @JoinColumn(name = "taskid"),                 // fk for task
            inverseJoinColumns = @JoinColumn(name = "roleid"))          // fk for role
    private Set<Role> roleSet;


    public Task(String name, User user, Set<Role> roleSet) {
        this.name = name;
        this.user = user;
        this.roleSet = roleSet;
    }
}