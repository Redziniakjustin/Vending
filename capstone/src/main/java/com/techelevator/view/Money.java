package com.techelevator.view;

import com.techelevator.VendingMachineCLI;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Money extends Display {

    //CLASS SCOPE BALANCE VARS
    static BigDecimal balance = new BigDecimal(0);
    static BigDecimal finalBalance = new BigDecimal(0);
    static String change;

    public Money() {
    }

    ;
    String[] mapOfItems = {};

    public void feedMoney(String selection) {
        balance = BigDecimal.valueOf(Double.parseDouble(String.valueOf(balance)));
        balance = balance.add(BigDecimal.valueOf(Double.parseDouble(selection)));
        System.out.println("Your balance is now $" + balance);
    }

    public BigDecimal makePurchase( BigDecimal currentPrice) {
        finalBalance = balance.subtract(currentPrice);
        return finalBalance;
    }

    public String makeChange(String change) {
        int quarterCount = 0;
        int dimeCount = 0;
        int nickelCount = 0;
        int result = (finalBalance.compareTo(BigDecimal.valueOf(Long.parseLong("0"))));

       // try {

            while (result == 1) {
                result = (finalBalance.compareTo(BigDecimal.valueOf(.25)));
                //result = (finalBalance.compareTo(BigDecimal.valueOf(Long.parseLong("0.25"))));
                if (result == 1 || result == 0) {
                    finalBalance.subtract(BigDecimal.valueOf(.25));
                   // finalBalance.subtract(BigDecimal.valueOf(Long.parseLong("0.25")));
                    quarterCount++;
                } else
                result = (finalBalance.compareTo(BigDecimal.valueOf(.10)));
                //result = (finalBalance.compareTo(BigDecimal.valueOf(Long.parseLong("0.10"))));
                if (result == 1 || result == 0) {
                    finalBalance.subtract(BigDecimal.valueOf(.10));
                    //finalBalance.subtract(BigDecimal.valueOf(Long.parseLong("0.10")));
                    dimeCount++;
                } else {
                    finalBalance.subtract(BigDecimal.valueOf(.05));
                    //finalBalance.subtract(BigDecimal.valueOf(Long.parseLong("0.05")));
                    nickelCount++;
                }
            }
            change = ("Dispensing " + finalBalance + " in " + quarterCount + " quarters " + dimeCount + " dimes " + nickelCount + " nickels ");

      //  } catch (NumberFormatException nfe) {
       // }
        return change;
    }
}