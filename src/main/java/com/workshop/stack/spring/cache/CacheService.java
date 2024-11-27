package com.workshop.stack.spring.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CacheService {
    @Autowired
    private CacheUsage cacheUsage;

    public CacheService(CacheUsage cacheUsage) {
        this.cacheUsage = cacheUsage;
    }

    public String getUserFromCache(int id) {
        cacheUsage.getUser(id);
        return cacheUsage.getUser(id);
    }
}
