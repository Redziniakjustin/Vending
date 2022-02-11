package com.techelevator.view;

import java.math.BigDecimal;

public class Gum extends Item {

    public Gum(String name, BigDecimal price, int quantity) {
        super(name, price,  quantity);
    }

    @Override
    public String message() {
        return "Chew Chew, Yum!";
    }


}
