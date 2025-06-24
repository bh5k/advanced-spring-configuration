package com.pluralsight.beanconfig.controller;

import com.pluralsight.beanconfig.model.Pie;
import com.pluralsight.beanconfig.service.PieService;
import com.pluralsight.beanconfig.util.PieCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pie")
public class PieController {

    private final PieService pieService;
    private final PieCalculator pieCalculator;

    @Autowired
    public PieController(PieService pieService, PieCalculator pieCalculator) {
        this.pieService = pieService;
        this.pieCalculator = pieCalculator;
    }

    @GetMapping("/pies")
    public List<Pie> getPies() {
        return pieService.getAvailablePies();
    }
}
