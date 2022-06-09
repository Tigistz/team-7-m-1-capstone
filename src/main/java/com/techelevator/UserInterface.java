package com.techelevator;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInterface {
    //Method called display menu
    Scanner userInput = new Scanner(System.in);

    public String displayMainMenu(){
        System.out.println("********************");
        System.out.println("Welcome to Team 7's Catering Solutions!!");
        System.out.println("********************");
        System.out.println("Please select from the following menu: ");
        System.out.println("1.) Display Catering Items\n2.)Order\n3.)Quit");
        System.out.println("********************");
       return userInput.nextLine();

    }
    public void displayCateringItems(Inventory inventory){
        String header =   String.format("%-15s%-15s%-10s%-10s","Product Code","Description","Qty", "Price");
        System.out.println(header);
        for (Object item : inventory.getInventory().descendingKeySet()){
           // Product Code     Description        Qty      Price
          String testString =   String.format("%-15s%-15s%-10s%-10s","Product Code","Description","Qty", "Price");
            System.out.println(testString);

    }

}}
