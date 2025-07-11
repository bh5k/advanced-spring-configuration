package com.pieshop.services;

public class HolidayDiscountService implements DiscountService {

    @Override
    public String getDiscountMessage() {
        return "🎉 Holiday special discount: 25% off your pie order! 🎉";
    }
}
