package com.techelevator;

public class Dessert extends Item{
        public Dessert(String productType, String productCode, String description, double price) {
        super(productType,productCode, description, price, 25);

}
    public String toString() {
        return "Coffee goes with Dessert.";
    }
    public String getProductType() {
        String productType = "Dessert";
        return productType;
    }
}
