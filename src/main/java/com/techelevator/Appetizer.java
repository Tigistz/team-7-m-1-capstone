package com.techelevator;

public class Appetizer extends Item{

    public Appetizer(String productCode, String description, double price) {
        super(productCode, description, price);

}
    public String toString() {
        return "You might need extra plates";
    }
    public String getProductType() {
        String productType = "Appetizer";
        return productType;
    }

}
