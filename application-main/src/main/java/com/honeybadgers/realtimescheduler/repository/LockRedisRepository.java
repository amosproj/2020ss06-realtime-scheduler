package com.honeybadgers.realtimescheduler.repository;

import com.honeybadgers.models.RedisLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Repository
@Slf4j
public class LockRedisRepository implements CrudRepository<RedisLock, String> {

    private static final String KEY = "LOCK";

    @Autowired
    @Qualifier("lockRedisTemplate")
    RedisTemplate<String, RedisLock> redisTemplate;

    private HashOperations<String, String, RedisLock> hashOperations;

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public <S extends RedisLock> S save(S s) {
        hashOperations.put(KEY, s.getId(), s);
        return s;
    }

    @Override
    public <S extends RedisLock> Iterable<S> saveAll(Iterable<S> iterable) {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public Optional<RedisLock> findById(String s) {
        RedisLock lock = hashOperations.get(KEY,s);
        if(lock == null)
            return Optional.empty();
        return Optional.of(lock);
    }

    @Override
    public boolean existsById(String s) {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public Iterable<RedisLock> findAll() {
        return hashOperations.entries(KEY).values();
    }

    @Override
    public Iterable<RedisLock> findAllById(Iterable<String> iterable) {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public long count() {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public void deleteById(String s) {
        hashOperations.delete(KEY, s);
    }

    @Override
    public void delete(RedisLock redisLock) {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public void deleteAll(Iterable<? extends RedisLock> iterable) {
        throw new RuntimeException("NotImplemented!");
    }

    @Override
    public void deleteAll() {
        throw new RuntimeException("NotImplemented!");
    }
}
