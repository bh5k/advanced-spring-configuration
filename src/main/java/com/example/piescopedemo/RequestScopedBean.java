package com.example.piescopedemo;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

@Component

public class RequestScopedBean {

    private final String uuid = UUID.randomUUID().toString();

    public String getUuid() {
        return uuid;
    }
}
