package com.techelevator;

import java.util.*;

public class Inventory {
    //Stock inventory constructor
    // Call the file reader method
    private TreeMap<String, Item> inventory = new TreeMap<>();



    public Inventory(){
        FileReader fileReader = new FileReader();
       List<Item> inventoryList = fileReader.stockInventory();
       for (Item item : inventoryList){
           inventory.put(item.getProductCode(),item);
       }
    }


    public List<Item> getInventoryItems() {

        List<Item> items = new ArrayList<>();
        for (Map.Entry<String, Item> key : inventory.entrySet()) {
            items.add(key.getValue());
        }
        return items;
    }

    public Item buildInventoryCartItem(String productCode, int quantityPurchased) {
        //(String productCode, String description, double price)
        Item existingItemFromMap = inventory.get(productCode);
        Item newItem = new Item(productCode, existingItemFromMap.getDescription(), existingItemFromMap.getPrice(), quantityPurchased);

       //subtract quantity purchased from existingItemInMap
       existingItemFromMap.setQuantity(existingItemFromMap.getQuantity() - quantityPurchased);
       inventory.put(productCode, existingItemFromMap);

        return newItem;


    }




    public boolean isValidProductCode (String productCode) {
        if (inventory.get(productCode) != null) {
            return true;
        }
        return false;
    }

    public boolean isEnoughToBuy(String productCode, int quantityRequested) {
        Item item = inventory.get(productCode);
        if (quantityRequested <= item.getQuantity()) {
            return true;
        }
        return false;
    }

    public double getItemPrice(String productCode) {
        return inventory.get(productCode).getPrice();
    }

}
