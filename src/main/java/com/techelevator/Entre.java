package com.techelevator;

public class Entre extends Item{

    public Entre(String productType, String productCode, String description, double price) {
        super(productType,productCode, description, price, 25);

}
    public String toString() {
        return "Did you remember Dessert?";
    }
    public String getProductType() {
        String productType = "Entre";
        return productType;
    }

}
