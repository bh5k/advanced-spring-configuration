package com.pieshop.config;

import com.pieshop.services.DiscountService;
import com.pieshop.services.HolidayDiscountService;
import com.pieshop.services.StandardDiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class DiscountServiceConfig {

    @Bean
    public DiscountService discountService() {
        // Let's say holidays are THURSDAY
        LocalDate today = LocalDate.now();
        DayOfWeek dow = today.getDayOfWeek();
        String name = dow.name();
        if (name.equalsIgnoreCase("THURSDAY")) {
            return new HolidayDiscountService();
        } else {
            return new StandardDiscountService();
        }
    }
}
