package com.techelevator.view;

import java.math.BigDecimal;

public class Gum extends Item {

    //CONSTRUCTOR
    public Gum(String name, String price,String type, int quantity) {
        super(name, price,type,quantity);
    }

    public Gum(String inputItem, BigDecimal valueOf, String inputItem1) {
        super(inputItem, valueOf, inputItem1);
    }

    @Override
    public String message() {
        return "Chew Chew, Yum!";
    }


}
