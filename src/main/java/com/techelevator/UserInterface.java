package com.techelevator;

import java.util.*;

public class UserInterface {
    //Method called display menu
    Scanner userInput = new Scanner(System.in);

    public String displayMainMenu() {
        System.out.println("**************************************");
        System.out.println("Welcome to Team 7's Catering Solutions!!");
        System.out.println("**************************************");
        System.out.println("Please select from the following menu: ");
        System.out.println("1.) Display Catering Items\n2.)Order\n3.)Quit");
        System.out.println("**************************************");
        return userInput.nextLine();

    }

    public void displayCateringItems(Inventory inventory) {

        String header = String.format("%-15s%-25s%-10s%-10s", "Product Code", "Description", "Qty", "Price");
        System.out.println(header);
        // for (Map.Entry<String, String> nameZip : nameToZip.entrySet())
        // Set<String> keys = stateCodes.keySet();
        Map<String, Item> inventoryMap = inventory.getInventory();
        //for (Map.Entry<K, V> entry : myMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());

        for (Map.Entry<String, Item> key : inventoryMap.entrySet()) {
            String formattedString = String.format("%-15s%-25s%-10s%-10s", key.getValue().getProductCode(), key.getValue().getDescription(), key.getValue().getQuanity(), key.getValue().getPrice());
            System.out.println(formattedString);


        }

    }
    // (1) Add Money
    //    (2) Select Products
    //    (3) Complete Transaction
    //    Current Account Balance: $0.00
    public String subMenu(){
        System.out.println("**************************************");
        System.out.println("Please select the action to perform");
        System.out.println("1.)Add Money\n2.) Select Products\n3.)CompleteTransaction");
        // This is where Current Balance Will Be
       String answer = userInput.nextLine();
        return answer;
    }

    public void displayErrorMessage(String message){
        System.err.println(message);;
    }

}
