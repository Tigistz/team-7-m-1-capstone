package com.techelevator;

public class Appetizer extends Item{

    public Appetizer(String productType, String productCode, String description, double price) {
        super(productType, productCode, description, price, 25);

}
    public String getMessage(){
        return "You might need extra plates.";
    }
    @Override
    public String getProductType() {
        String productType = "Appetizer";
        return productType;
    }

}
