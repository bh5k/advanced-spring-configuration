package com.example.piescopedemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrderIdGenerator {
    private final String id = java.util.UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
