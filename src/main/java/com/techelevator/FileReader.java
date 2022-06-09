package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    //Read input file and it's going to determine the item type

    private File itemFile = new File("cateringsystem.csv");
    private Scanner scanner;

    {
        try {
            scanner = new Scanner(itemFile);
            public List<Item> stockInventory() {
                while (scanner.hasNextLine()) {
                    

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    }
}
