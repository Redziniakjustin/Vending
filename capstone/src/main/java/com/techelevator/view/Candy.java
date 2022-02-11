package com.techelevator.view;

import java.math.BigDecimal;

public class Candy extends Item {

    public Candy(String name, BigDecimal price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String message() {
        return "Munch Munch, Yum!";
    }
}
