package com.example.piescopedemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component

public class SessionScopedBean {

    private int visitCount = 0;

    public int incrementVisit() {
        return ++visitCount;
    }
}

