package com.renzo.onlinestore.api.redisapi;

public interface RedisService {

    <T> T get(KeyPrefix prefix, String key, Class <T> clazz);

    <T> boolean set(KeyPrefix prefix, String key, T value);

    Long incr(KeyPrefix prefix, String key);

    Long decr(KeyPrefix prefix, String key);

    boolean exists(KeyPrefix prefix, String key);

    boolean delete(KeyPrefix prefix, String key);
}
