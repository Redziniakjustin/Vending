package com.techelevator.view;

import java.math.BigDecimal;

public class Beverages extends Item {

    public Beverages(String name, String price,String type, int quantity) {
        super(name, price,type,quantity);
    }

    public Beverages(String inputItem, BigDecimal valueOf) {
        super(inputItem,valueOf);
    }

    public Beverages(String inputItem, BigDecimal valueOf, String inputItem1) {
        super(inputItem, valueOf, inputItem1);
    }


    @Override
    public String message() {
        return "Glug Glug, Yum!";
    }
}
