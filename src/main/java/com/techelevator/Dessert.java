package com.techelevator;

public class Dessert extends Item{
        public Dessert(String productCode, String description, double price) {
        super(productCode, description, price, 25);

}
    public String toString() {
        return "Coffee goes with Dessert.";
    }
    public String getProductType() {
        String productType = "Dessert";
        return productType;
    }
}
