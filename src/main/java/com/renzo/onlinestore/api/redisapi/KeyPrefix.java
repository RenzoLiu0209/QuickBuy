package com.renzo.onlinestore.api.redisapi;

public interface KeyPrefix {
    int getExpireseconds();
    String getPrefix();
}
