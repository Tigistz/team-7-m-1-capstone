package com.techelevator;

import com.techelevator.view.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    //Read input file and it's going to determine the item type

    private File itemFile = new File("cateringsystem.csv");
    private Scanner scanner;

    public List<Item> stockInventory() {
    {
        try {
            scanner = new Scanner(itemFile);
            while (scanner.hasNextLine()) {
                String nextProduct = scanner.nextLine();
                String[] splitProduct = nextProduct.split("|");


                    

                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    }
}
