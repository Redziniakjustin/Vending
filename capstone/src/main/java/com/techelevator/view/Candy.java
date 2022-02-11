package com.techelevator.view;

import java.math.BigDecimal;

public class Candy extends Item {

    public Candy(String name, String price,String type, int quantity) {
        super(name, price,type,quantity);
    }

    public Candy(String inputItem, BigDecimal valueOf, String inputItem1) {
        super(inputItem, valueOf, inputItem1);
    }

    @Override
    public String message() {
        return "Munch Munch, Yum!";
    }
}
