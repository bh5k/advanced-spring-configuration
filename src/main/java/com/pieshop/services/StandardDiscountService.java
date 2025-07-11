package com.pieshop.services;

public class StandardDiscountService implements DiscountService {

    @Override
    public String getDiscountMessage() {
        return "Standard discount: 10% off your pie order.";
    }
}
