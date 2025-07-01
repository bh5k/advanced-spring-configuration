package com.example.piescopedemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component

public class OrderIdGenerator {
    private final String id = java.util.UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
