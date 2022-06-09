package com.techelevator;

public class Beverage extends Item {
    private String productType;

    public Beverage(String productType,String productCode, String description, double price) {
        super(productCode, description, price);
        this.productType = productType;
    }


    public String toString() {
        return "Don't Forget Ice.";
    }
}

