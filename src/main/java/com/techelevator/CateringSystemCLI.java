package com.techelevator;


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

boolean isRunning = true;

while (isRunning){
	// Call display menu
String answer =	ui.displayMainMenu();
	if (answer.equals("1")){
	ui.displayCateringItems(inventory);
	}
	if (answer.equals(("2"))){
		String subAnswer = ui.subMenu();
		if (subAnswer.equals("1") || subAnswer.endsWith("2") || subAnswer.equals("3")){

		}
		else {
			ui.displayErrorMessage("That is not a valid option. Please make another selection");
		}
	}


}

	}
	
	



}
