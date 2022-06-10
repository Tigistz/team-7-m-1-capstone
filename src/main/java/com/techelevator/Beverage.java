package com.techelevator;

public class Beverage extends Item {


    public Beverage( String productCode, String description, double price) {
        super(productCode, description, price);
    }


    public String toString() {
        return "Don't Forget Ice.";
    }


    public String getProductType() {
        String productType = "Beverage";
        return productType;
    }
}
