package com.techelevator.view;

import java.math.BigDecimal;

public class Beverages extends Item {

    public Beverages(String name, BigDecimal price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String message() {
        return "Glug Glug, Yum!";
    }
}
