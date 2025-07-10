package com.pieshop;

import com.pieshop.cache.PieCache;
import com.pieshop.notification.PieNotificationService;
import com.pieshop.promo.FreePiePromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PieshopApplication implements CommandLineRunner {

    @Autowired
    private PieCache pieCache;

    @Autowired(required = false)
    private PieNotificationService notificationService;

    @Autowired(required = false)
    private FreePiePromotionService promotionService;

    public static void main(String[] args) {
        SpringApplication.run(PieshopApplication.class, args);
    }

    @Override
    public void run(String... args) {
        pieCache.cachePie("Apple Crumble");

        if (notificationService != null) {
            notificationService.notifyPieReady("Apple Crumble");
        }

        if (promotionService != null) {
            promotionService.announceFreePie();
        }
    }
}