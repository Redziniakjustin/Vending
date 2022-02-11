package com.techelevator.view;

import java.math.BigDecimal;

public class Item {
    protected String name;
    protected BigDecimal price;
    protected int quantity =5;
    protected String type;

    public Item(String inputItem, BigDecimal valueOf) {}
    public Item(String inputItem, BigDecimal valueOf, String inputItem1) {}

    public Item() {}


    //GETTERS
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }



    //METHOD
    public Item(String name, BigDecimal  price, String type ,int quantity){
        this.name=name;
        this.price=price;
        this.type=type;
        this.quantity=quantity;
    }

//    public abstract String message();
}
