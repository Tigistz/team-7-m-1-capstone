package com.techelevator;

public class Dessert extends Item{
        public Dessert(String productCode, String description, double price) {
        super(productCode, description, price);

}
    public String toString() {
        return "Coffee goes with Dessert.";
    }
    public String getProductType() {
        String productType = "Dessert";
        return productType;
    }
}
