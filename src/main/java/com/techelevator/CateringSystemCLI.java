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

boolean isrunning = true;

while (isrunning){
	// Call display menu
String answer =	ui.displayMainMenu();
	if (answer.equals("1")){
	ui.displayCateringItems(inventory);
	}


}

	}
	
	



}
