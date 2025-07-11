package com.pieshop.services;

import com.pieshop.annotation.LoggedLazyComponent;
import jakarta.annotation.PostConstruct;


@LoggedLazyComponent("Sales Reporting Service")
public class SalesReportService {

    @PostConstruct
    public void init() {
        System.out.println("🔍 Lazy bean created: " + getClass().getSimpleName() + " [Sales Reporting Service]");
    }

    public String generateReport() {
        return "📊 Sales report data generated!";
    }
}
