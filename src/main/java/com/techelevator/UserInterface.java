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
            int quantity = key.getValue().getQuanity();
          if (quantity == 0){
              String formattedString = String.format("%-15s%-25s%-10s%-10s", key.getValue().getProductCode(), key.getValue().getDescription(), "SOLD OUT", key.getValue().getPrice());
              System.out.println(formattedString);

          }
            else {

              String formattedString = String.format("%-15s%-25s%-10s%-10s", key.getValue().getProductCode(), key.getValue().getDescription(), key.getValue().getQuanity(), key.getValue().getPrice());
              System.out.println(formattedString);
          }


        }

    }
    // (1) Add Money
    //    (2) Select Products
    //    (3) Complete Transaction
    //    Current Account Balance: $0.00
    public String subMenu(double currentBalance){
        System.out.println("**************************************");
        System.out.println("Please select the action to perform");
        System.out.println("1.)Add Money\n2.) Select Products\n3.)CompleteTransaction");
        System.out.println( "Current Balance: $" + currentBalance);
       String answer = userInput.nextLine();
        return answer;
    }

    public void displayErrorMessage(String message){
        System.err.println(message);;
    }
    public  double addMoney(){
        System.out.println("Please insert(type) your bills. Only accepts $1,$5,$10,$20,$50,and $100 dollar bills");
      String bill =  userInput.nextLine();
        if (bill.equals("1") || bill.equals("5") || bill.equals("10") || bill.equals("20") || bill.equals("50") || bill.equals("100")){
            System.out.println("Money accepted.");
            Double billAsDouble = Double.parseDouble(bill);
            return  billAsDouble;
        }
        else {
            displayErrorMessage("That is not a valid bill.");
            return 0.00;
        }

    }

    public  String selectProduct(){
        System.out.println("Please enter the product you would like to purchase.");
        String productWanted = userInput.nextLine();
        return productWanted;

    }
    public int quantityToPurchase(){
        System.out.println(" How many would you like to purchase?");
        String quantityWanted = userInput.nextLine();
        Integer quanity = Integer.parseInt(quantityWanted);
        return quanity;
    }

}
