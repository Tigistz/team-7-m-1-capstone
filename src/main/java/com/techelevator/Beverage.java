package com.techelevator;

public class Beverage extends Item {


    public Beverage(String productType, String productCode, String description, double price) {
        super(productType,productCode, description, price, 25);
    }


    public String toString() {
        return "Don't Forget Ice.";
    }


    public String getProductType() {
        String productType = "Beverage";
        return productType;
    }
}
