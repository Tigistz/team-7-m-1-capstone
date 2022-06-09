package com.techelevator;

public class Appetizer extends Item{
    private String productType;
    public Appetizer(String productType,String productCode, String description, double price) {
        super(productCode, description, price);
        this.productType = productType;
}
    public String toString() {
        return "You might need extra plates";
    }

}
