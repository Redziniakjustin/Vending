package com.techelevator;

import com.techelevator.view.*;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import javax.crypto.spec.PSource;

public class VendingMachineCLI extends Display {

	public static String selection;
	public static String slotNumber = "";

	//MAIN MENU FINAL VARIABLES
	private static final String MMO_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MMO_PURCHASE = "Purchase";
	private static final String EXIT = "Exit";
	private static final String[] MM_OPTIONS = {MMO_DISPLAY_ITEMS, MMO_PURCHASE, EXIT};

	//PURCHASE MENU FINAL VARIABLES
	private static final String PMO = "Feed money";
	private static final String PM0_SELECT_PRODUCT = "Select Product";
	private static final String PMO_FINISH = "Finish Transaction";
	private static final String[] PMO_OPTIONS = {PMO, PM0_SELECT_PRODUCT, PMO_FINISH};

	private String list;
	//Refactor Later
	private Menu menu;
	private VendingMachine VendingMachine = new VendingMachine();
	public Money money = new Money();
	public Item item = new Item();
	public Beverages beverage = new Beverages(keyAndValueMap.get(slotNumber));



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
		this.VendingMachine = new VendingMachine();
	}

	public Menu getMenu() {
		return menu;
	}
	public String getList() {
		return list;
	}


	public void run() {

		String[] display = {};
		String[] mapOfItems = {};

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MM_OPTIONS);

			Scanner purchaseScanner = new Scanner(System.in);

			if (choice.equals(MMO_DISPLAY_ITEMS)) {
				//TO DO COME BACK AND REFACTOR THIS
				System.out.println(readFile(display).subList(0, 4));
				System.out.println(readFile(display).subList(4, 8));
				System.out.println(readFile(display).subList(8, 12));
				System.out.println(readFile(display).subList(12, 16));


			} else if (choice.equals(MMO_PURCHASE)) {
					while (true) {
						choice = (String) menu.getChoiceFromOptions(PMO_OPTIONS);

						if (choice.equals(PMO)) {
							System.out.println(" Vending Machine only accepts $1, $2, $5, and $10");
							System.out.print("Please enter an amount : ");
							selection = purchaseScanner.nextLine();
							if (!(selection.equals("1")) && !(selection.equals("2")) && !(selection.equals("5")) && !(selection.equals("10"))) {
								System.out.println("Sorry, we only take ones, twos, fives, and tens!");
							} else
								money.feedMoney(selection);
							// Not looping back to purchase menu
						} else if (choice.equals(PM0_SELECT_PRODUCT)) {
							//	while (true) { with this while statement we loop back to the select product prompt, without it we go to purchase menu
							System.out.println("Please enter the item's slot number");
							slotNumber = purchaseScanner.nextLine();
								if ( !slotList.contains(slotNumber)) {
									System.out.println("Sorry, that isn't a valid slot number");
									//} else if (keyAndValueMap.get(item.getQuantity()).equals(0)) {
									//	System.out.println("Sold Out");
								} else {
									int currentIndex = slotList.indexOf(slotNumber);
									String currentName = nameList.get(currentIndex);
									BigDecimal currentPrice = priceList.get(currentIndex);

									System.out.println("Your selected: "+ currentName+ " for $"+currentPrice);
								//	String otherUpdate = beverage.name();
									//String update = keyAndValueMap.get(slotNumber).toString();
								}
								//	}
						}
					}
		} else if (choice.equals(EXIT)) {
			System.exit(0);
		}
	}

}
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
