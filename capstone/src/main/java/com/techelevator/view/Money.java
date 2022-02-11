package com.techelevator.view;

import com.techelevator.VendingMachineCLI;

import java.math.BigDecimal;

public class Money extends VendingMachineCLI {

    //CLASS SCOPE BALANCE VARS
    static BigDecimal balance = new BigDecimal(0);

    public Money(Menu menu, String selection) {
        super(menu, selection);
       // super(menu(selection));
    }

    public static Menu menu (String selection) {
        if(!(selection.equals("1"))&&!(selection.equals("2"))&&!(selection.equals("5"))&&!(selection.equals("10"))) {
            System.out.println("Invalid bill selection");
        } else {
            balance = BigDecimal.valueOf(Double.parseDouble(String.valueOf(balance)));
            balance = balance.add(BigDecimal.valueOf(Double.parseDouble(selection)));
        //System.out.println("Your balance is now $" + balance);
        }

        return menu(selection);
    }
}
