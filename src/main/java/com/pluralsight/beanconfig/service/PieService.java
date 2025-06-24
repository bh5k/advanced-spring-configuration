package com.pluralsight.beanconfig.service;

import com.pluralsight.beanconfig.model.Pie;
import org.springframework.stereotype.Service;

import java.util.List;

public class PieService {
    public List<Pie> getAvailablePies() {
        return List.of(new Pie("Apple Pie"),
                new Pie("Cherry Pie"),
                new Pie("Key Lime Pie"));
    }
}
