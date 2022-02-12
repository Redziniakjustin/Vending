package com.techelevator.view;

import java.math.BigDecimal;

public class Beverages extends Item {



    public Beverages(String inputItem, BigDecimal valueOf, String inputItem1, int quantity) {
        super(inputItem, valueOf, inputItem1, quantity);
    }


    public String message() {
        return "Glug Glug, Yum!";
    }
}
