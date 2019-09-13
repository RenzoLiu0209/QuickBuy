package com.renzo.onlinestore.redis.rediskey;

import com.renzo.onlinestore.api.redisapi.BasePrefix;

public class UserKey extends BasePrefix {
    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
}
