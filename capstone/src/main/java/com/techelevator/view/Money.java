package com.techelevator.view;

import com.techelevator.VendingMachineCLI;

import java.math.BigDecimal;
import java.util.Map;

public class Money {

    //CLASS SCOPE BALANCE VARS
    static BigDecimal balance = new BigDecimal(0);
    public Money(){};


    public void feedMoney (String selection) {
            balance = BigDecimal.valueOf(Double.parseDouble(String.valueOf(balance)));
            balance = balance.add(BigDecimal.valueOf(Double.parseDouble(selection)));
        System.out.println("Your balance is now $" + balance);
        }

    public void makePurchase (BigDecimal balance, Map keyAndValueMap) {

    }


}
