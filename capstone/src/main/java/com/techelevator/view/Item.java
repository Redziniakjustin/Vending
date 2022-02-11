package com.techelevator.view;

import java.math.BigDecimal;

public abstract class Item {
    protected String name;
    protected BigDecimal price;
    protected int quantity =5;

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

    //METHOD
    public Item(String name, BigDecimal price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public abstract String message();
}
