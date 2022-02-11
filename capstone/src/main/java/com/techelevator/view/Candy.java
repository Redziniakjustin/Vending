package com.techelevator.view;

public class Candy implements Item{
//    private String name;
//    private int price;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String message() {
        return "Munch Munch, Yum!";
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public int slotNumber() {
        return 0;
    }
}
