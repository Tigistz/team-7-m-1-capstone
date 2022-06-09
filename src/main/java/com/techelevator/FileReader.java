package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class FileReader {
    //Read input file and it's going to determine the item type

    private File itemFile = new File("cateringsystem.csv");
    private Scanner scanner;

    public List<Item> stockInventory() {
        List<Item> inventory = new ArrayList<>();
    {
        try {
            scanner = new Scanner(itemFile);
            while (scanner.hasNextLine()) {
                //order of file B|B1|Soda|1.50
                String nextProduct = scanner.nextLine();
                String[] splitProduct = nextProduct.split("\\|");
                if (splitProduct[0].equals("A")) {
                    //String productType,String productCode, String description, double price)
                    Item newItem = new Appetizer(splitProduct[0], splitProduct[1], splitProduct[2], Double.parseDouble(splitProduct[3]));
                    inventory.add(newItem);
                }
                if (splitProduct[0].equals("B")) {
                    //String productType,String productCode, String description, double price)
                    Item newItem = new Beverage(splitProduct[0], splitProduct[1], splitProduct[2], Double.parseDouble(splitProduct[3]));
                    inventory.add(newItem);
                }
                if (splitProduct[0].equals("D")) {
                    //String productType,String productCode, String description, double price)
                    Item newItem = new Dessert(splitProduct[0], splitProduct[1], splitProduct[2], Double.parseDouble(splitProduct[3]));
                    inventory.add(newItem);
                }
                if (splitProduct[0].equals("E")) {
                    //String productType,String productCode, String description, double price)
                    Item newItem = new Entre(splitProduct[0], splitProduct[1], splitProduct[2], Double.parseDouble(splitProduct[3]));
                    inventory.add(newItem);
                }
            }


                    



        } catch (FileNotFoundException e) {
            e.printStackTrace();// TODO change this at something
        }
    }

return inventory;
    }
}
