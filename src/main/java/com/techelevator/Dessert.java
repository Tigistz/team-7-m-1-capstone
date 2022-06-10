package com.techelevator;

public class Dessert extends Item{
    private String productType;
    public Dessert(String productType,String productCode, String description, double price) {
        super(productCode, description, price);
        this.productType = productType;
}
    public String toString() {
        return "Coffee goes with Dessert.";
    }
}
