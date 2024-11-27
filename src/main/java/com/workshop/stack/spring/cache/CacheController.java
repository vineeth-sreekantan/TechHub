package com.workshop.stack.spring.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    private CacheService serviceClass;

    @RequestMapping("/getUserFromCache/{id}")
    String getCacheable(@PathVariable("id") int id) {
        return serviceClass.getUserFromCache(id);
    }
}
