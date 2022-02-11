package com.techelevator.view;

import java.math.BigDecimal;

public class Chips extends Item {

    public Chips(String name, String price,String type, int quantity) {
        super(name, price,type,quantity);
    }

    public Chips(String inputItem, BigDecimal valueOf, String inputItem1) {
            super(inputItem, valueOf, inputItem1);
    }

    @Override
    public String message() {
        return "Crunch Crunch, Yum!";
    }
}
