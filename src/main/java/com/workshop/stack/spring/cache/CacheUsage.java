package com.workshop.stack.spring.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheUsage {

    @Cacheable(value = "users", key = "#userId")
    public String getUser(int userId) {
        System.out.println("Inside GetUser : "+userId);
        if (userId == 1) {
            return "User 1";
        } else if (userId == 2) {
            return "User 2";
        } else if (userId == 3) {
            return "User 3";
        }
        return null;
    }
}
