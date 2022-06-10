package com.techelevator;


import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class CateringSystemCLI {


	
	public static void main(String[] args) {
		CateringSystemCLI cli = new CateringSystemCLI();
		cli.run();
	}	

	
	
	public void run() {
		//probably should do stuff here... ;-)
		// This is where call the stock inventory constructor
		//While loop that's going to start with a display menu
Inventory inventory = new Inventory();
UserInterface ui = new UserInterface();
Ledger ledger = new Ledger();

boolean isRunning = true;

while (isRunning){
	// Call display menu
String answer =	ui.displayMainMenu();
	if (answer.equals("1")){
	ui.displayCateringItems(inventory);
	}
	if (answer.equals(("2"))){
		boolean subIsRunning = true;
		double currentBalance = ledger.getCurrentBalance();
		while (subIsRunning){
		String subAnswer = ui.subMenu( currentBalance);
		if (subAnswer.equals("1") || subAnswer.endsWith("2") || subAnswer.equals("3")){
			if (subAnswer.equals("1")){
				double moneyToAdd = ui.addMoney();
				if (moneyToAdd + ledger.getCurrentBalance() <=500){
			 currentBalance =	ledger.changeCurrentBalance(moneyToAdd);


			}
				else {
					ui.displayErrorMessage("Your balance cannot exceed $500");
				}

		}
			else if (subAnswer.equals("2")){
				ui.displayCateringItems(inventory);
				String productCode = ui.selectProduct();
				if (inventory.getInventory().containsKey(productCode)){
					int amountToBuy = ui.quantityToPurchase();
					TreeMap<String, Item> products = inventory.getInventory();
				int	productQuantity = products.get(productCode).getQuanity();
					if (amountToBuy <= productQuantity){
						// send to Cart
					}
					else {
						ui.displayErrorMessage(" There is not enough stock for that purchase.");
					}
				}
				else {
					ui.displayErrorMessage("That product does not exist");
				}
			}
		else {
			ui.displayErrorMessage("That is not a valid option. Please make another selection");
		}
	}


}

	}
	
	



}}}
