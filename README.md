# Vending Machine CLI

## 💸 Summary
Developed a command line application and used File I/O for logging and tracking sales while implementing the Object Oriented fundamentals of encapsulation, inheritance, and polymorphism. Created a series of JUnit tests to ensure functionality and operation of application.

## 💥 Features
When the application starts, it looks for a vendingmachine.csv file, a sample of which is supplied in this code. This loads items into the machine. Once you have this, all other functions can be performed by putting money into the machine and making purchases.

This machine keeps a log of purchases made. A sales report can be printed by inputting 0 in the main menu. This will print the report as a CSV which includes the number of each item sold and a grand total of revenue.

The vending machine dispenses beverages, candy, chips, and gum.
Each vending machine item has a Name and a Price.
A main menu must display when the software runs, presenting the following options:

## The purchase process flow is as follows:
- Selecting "(1) Feed Money" allows the customer to repeatedly feed money into the machine in valid, whole dollar amounts—for example, $1, $2, $5, or $10.
- The "Current Money Provided" indicates how much money the customer has fed into the machine.
- Selecting "(2) Select Product" allows the customer to select a product to purchase.
- Show the list of products available and allow the customer to enter a code to select an item.
- If the product code does not exist, the customer is informed and returned to the Purchase menu.
- If a product is sold out, the customer is informed and returned to the Purchase menu.
- If a valid product is selected, it is dispensed to the customer.
- Dispensing an item prints the item name, cost, and the money remaining. Dispensing also returns the appropriate message.
- After the product is dispensed, the machine must update its balance accordingly and return the customer to the Purchase menu.
- Selecting "(3) Finish Transaction" allows the customer to complete the transaction and receive any remaining change.
- The customer's money is returned using nickels, dimes, and quarters (using the smallest amount of coins possible).
- After completing their purchase, the user is returned to the "Main" menu to continue using the vending machine.
- All purchases are audited to prevent theft from the vending machine into Log.txt.

## 📅 Initial Planning
![image](https://user-images.githubusercontent.com/47091126/159129867-abbb6753-5e00-46d1-b09f-32a7947f1769.png)

## 🥵 Challenges
On the first iteration of this project, being able to correctly navigate through the provided csv proved challenging. Our decision was to place each property (name, price, type, cost) into seperate lists, which caused issued when having to properly track quantity. This was changed when making revisions individually, where I was able to correctly use a Hashmap. Furthermore, properly recognizing how to instantiate items and use them appropriately in classes was an ititial challenge. 

## 🐛 Known Bugs
- BigDecimal rounding to 2 spots
- Use Display not userfriendly when attempting to select items.
  
## 🚀 Technologies Used
Java

## ✊🏼 Team
Justin Redziniak & Max Smith
