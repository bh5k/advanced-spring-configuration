package com.pieshop.promo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DiscountService {

    @Autowired
    private Environment env;

    @PostConstruct
    public void logDiscountInfo() {
        String discount = env.getProperty("pieshop.holiday-discount-percentage", "0");
        System.out.println("🎉 Holiday Discount: " + discount + "% off pies!");

        // Read boolean property with a default of false
        boolean isFreePieEnabled = Boolean.parseBoolean(env.getProperty("pieshop.freepie.enabled", "false"));
        if (isFreePieEnabled) {
            System.out.println("🥧 Free Pie promotion is ENABLED! Get your free pie today!");
        } else {
            System.out.println("🥧 No free pie promotion currently running.");
        }

        // Example: Read an integer property safely
        int maxPiesPerCustomer = Integer.parseInt(env.getProperty("pieshop.max-pies-per-customer", "5"));
        System.out.println("📦 Maximum pies per customer: " + maxPiesPerCustomer);
    }
}

