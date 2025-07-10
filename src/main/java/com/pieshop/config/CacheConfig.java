package com.pieshop.config;

import com.pieshop.cache.*;
import org.springframework.context.annotation.*;

@Configuration
public class CacheConfig {

    @Bean
    @Profile("dev")
    public PieCache inMemoryPieCache() {
        return new InMemoryPieCache();
    }

    @Bean
    @Profile("prod")
    public PieCache distributedPieCache() {
        return new DistributedPieCache();
    }
}