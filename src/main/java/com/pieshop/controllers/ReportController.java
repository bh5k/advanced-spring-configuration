package com.pieshop.controllers;

import com.pieshop.services.SalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/report")
    public String getSalesReport() {
        SalesReportService reportService = context.getBean(SalesReportService.class);
        return reportService.generateReport();
    }
}
