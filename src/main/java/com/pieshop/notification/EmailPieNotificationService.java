package com.pieshop.notification;

public class EmailPieNotificationService implements PieNotificationService {
    @Override
    public void notifyPieReady(String pieName) {
        System.out.println("📧 Notifying customer: " + pieName + " is ready!");
    }
}