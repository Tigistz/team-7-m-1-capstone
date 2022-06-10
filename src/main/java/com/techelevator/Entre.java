package com.techelevator;

public class Entre extends Item{

    public Entre(String productCode, String description, double price) {
        super(productCode, description, price);

}
    public String toString() {
        return "Did you remember Dessert?";
    }
    public String getProductType() {
        String productType = "Entre";
        return productType;
    }

}
