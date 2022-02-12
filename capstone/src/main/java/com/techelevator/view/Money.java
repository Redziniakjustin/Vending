package com.techelevator.view;

import com.techelevator.VendingMachineCLI;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Money extends Display{

    //CLASS SCOPE BALANCE VARS
    static BigDecimal balance = new BigDecimal(0);
    static BigDecimal finalBalance = new BigDecimal(0);
    public Money(){};
    String[] mapOfItems = {};

    public void feedMoney (String selection) {
            balance = BigDecimal.valueOf(Double.parseDouble(String.valueOf(balance)));
            balance = balance.add(BigDecimal.valueOf(Double.parseDouble(selection)));
        System.out.println("Your balance is now $" + balance);
        }
    public void makePurchase (BigDecimal balance, BigDecimal currentPrice) {
      finalBalance =balance.subtract(currentPrice);
    }
    public void makeChange (BigDecimal finalBalance){
        int quarterCount=0;
        int dimeCount=0;
        int nickelCount=0;
        int result;
        result = (finalBalance.compareTo(BigDecimal.valueOf(Long.parseLong("0"))));

        while(result==1){
            result = (finalBalance.compareTo(BigDecimal.valueOf(Long.parseLong("0.25"))));

        }
    }
}
