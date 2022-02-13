package com.techelevator.view;

import com.techelevator.VendingMachineCLI;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Money {

    //CLASS SCOPE BALANCE VARS
    public static BigDecimal balance = new BigDecimal(0);
    public Money() {
    }
    public Display display;
    public VendingMachineCLI cli;
    String[] mapOfItems = {};

    public void feedMoney(String selection) {
        balance = BigDecimal.valueOf(Double.parseDouble(String.valueOf(balance)));
        balance = balance.add(BigDecimal.valueOf(Double.parseDouble(selection)));
        System.out.println("Your balance is now $" + balance);
    }

    public BigDecimal makePurchase( BigDecimal currentPrice) {
        int result = (balance.compareTo(currentPrice));
        if (result == -1) {
            System.out.println("Your balance is too low to purchase this item.");
            VendingMachineCLI.finalBalance = balance;
        } else {
            VendingMachineCLI.finalBalance = balance.subtract(currentPrice);
            balance = balance.subtract(currentPrice);
           VendingMachineCLI.currentQuantity = VendingMachineCLI.currentQuantity-1;
        }
            return VendingMachineCLI.finalBalance;
    }

    public void makeChange(BigDecimal finalBalance) {
        int quarterCount = 0;
        int dimeCount = 0;
        int nickelCount = 0;
        BigDecimal x = VendingMachineCLI.finalBalance;
        int result = (x.compareTo(BigDecimal.valueOf(Long.parseLong("0"))));
        int result2;
        // try {
        while (result > 0) {
            result = (x.compareTo(BigDecimal.valueOf(.25)));
            if (result == 1 || result == 0) {
                x = x.subtract(BigDecimal.valueOf(.25));
                quarterCount++;
            } else {
                //assert a != null;
                result = (x.compareTo(BigDecimal.valueOf(.10)));
                result2 = (x.compareTo(BigDecimal.valueOf(.25)));
                if ((result == 1 || result == 0) && (result2 == -1)) {
                    x = x.subtract(BigDecimal.valueOf(.10));
                    dimeCount++;
                } else {
                    //assert b != null;
                    x = x.subtract(BigDecimal.valueOf(.05));
                    nickelCount++;
                }
            }
            // } catch (NumberFormatException nfe) {
            // }
        }
        System.out.println("Dispensing $" + VendingMachineCLI.finalBalance + " in " + quarterCount + " quarters " + dimeCount + " dimes " + nickelCount + " nickels ");
        balance = new BigDecimal(0);
    }
}