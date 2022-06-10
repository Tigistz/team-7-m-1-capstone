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

    public void displayCateringItems(List<Item> items) {

        String header = String.format("%-15s%-25s%-10s%-10s", "Product Code", "Description", "Qty", "Price");
        System.out.println(header);


        for (Item item : items ) {
            int quantity = item.getQuantity();
            if (quantity == 0){
               String formattedString = String.format("%-15s%-25s%-10s%-10s", item.getProductCode(), item.getDescription(), "SOLD OUT", item.getPrice());
               System.out.println(formattedString);

            }
            else {

              String formattedString = String.format("%-15s %-25s %-10s $%-10s", item.getProductCode(), item.getDescription(), item.getQuantity(), item.getPrice());
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

    public void printReceipt(Map<Item,Integer> purchasedItems, double cartTotal, int[] change){
        for (Map.Entry<Item, Integer> item : purchasedItems.entrySet()){
         String receiptFormat =  String.format("%-5s%-20s%-25s%-8s%-10s%-30s", item.getValue(), item.getKey().getProductType(), item.getKey().getDescription(), item.getKey().getPrice(),item.getKey().getPrice() *item.getValue(),item.getKey().toString());
            System.out.println(receiptFormat);
        }
        System.out.println(" Your Total is: " + cartTotal);
        System.out.println("You received (" + change[0] + ") Fifties, (" + change[1]+ ") Twenties, (" + change[2] + ") Tens, (" + change[3] + ") Fives, (" + change[4] + ") Ones, (" + change[5] + ") Quarters, (" + change[6] + ") Dimes, (" + change[7] + ") Nickles in change.");
        ;

    }

}
