package com.techelevator;

import com.techelevator.view.*;

import java.math.BigDecimal;
import java.util.Scanner;
import javax.crypto.spec.PSource;

public class VendingMachineCLI extends Display {

	public static String selection;

	//MAIN MENU FINAL VARIABLES
	private static final String MMO_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MMO_PURCHASE = "Purchase";
	private static final String EXIT = "Exit";
	private static final String[] MM_OPTIONS = { MMO_DISPLAY_ITEMS, MMO_PURCHASE,EXIT };

	//PURCHASE MENU FINAL VARIABLES
	private static final String PMO = "Feed money";
	private static final String PM0_SELECT_PRODUCT ="Select Product";
	private static final String PMO_FINISH = "Finish Transaction";
	private static final String [] PMO_OPTIONS = { PMO, PM0_SELECT_PRODUCT, PMO_FINISH};

	private String list;
	//Refactor Later
	private Menu menu;
	private VendingMachine VendingMachine= new VendingMachine();
	public Money money = new Money();
	public Item item = new Item();


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
			if (choice.equals(MMO_DISPLAY_ITEMS)) {
				//TO DO COME BACK AND REFACTOR THIS
				System.out.println(readFile(display).subList(0,4));
				System.out.println(readFile(display).subList(4,8));
				System.out.println(readFile(display).subList(8,12));
				System.out.println(readFile(display).subList(12,16));

			} else if (choice.equals(MMO_PURCHASE)) {
				while (true) {
					choice = (String) menu.getChoiceFromOptions(PMO_OPTIONS);
					Scanner purchaseScanner = new Scanner(System.in);
					System.out.println(" Vending Machine accepts $1, $2, $5, and $10");
					System.out.print("Please type amount : ");
					selection = purchaseScanner.nextLine();
					if (!(selection.equals("1")) && !(selection.equals("2")) && !(selection.equals("5")) && !(selection.equals("10"))) {
						System.out.println("Invalid bill selection");

					} else {
						money.feedMoney(selection);
					}

					System.out.println("Please input slot item number");
					String slotNumber = purchaseScanner.nextLine();
					if (!keyAndValueMap.containsKey(slotNumber)) {
						System.out.println("Does not exist");
					}
					else (keyAndValueMap.get(slotNumber) )
				}
				} else if(choice.equals(EXIT)) {
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
