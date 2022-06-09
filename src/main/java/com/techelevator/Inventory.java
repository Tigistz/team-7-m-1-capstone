package com.techelevator;

import java.util.List;
import java.util.TreeMap;

public class Inventory {
    //Stock inventory constructor
    // Call the file reader method
private TreeMap inventory = new TreeMap<>();


    public Inventory(){
        FileReader fileReader = new FileReader();
       List<Item> inventoryList = fileReader.stockInventory();
       for (Item item : inventoryList){
           inventory.put(item.getProductCode(),item);
       }

    }

    public TreeMap getInventory() {
        return inventory;
    }
}
