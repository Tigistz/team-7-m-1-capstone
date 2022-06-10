package com.techelevator;

public class Entre extends Item{
    private String productType;
    public Entre(String productType,String productCode, String description, double price) {
        super(productCode, description, price);
        this.productType = productType;
}
    public String toString() {
        return "Did you remember Dessert?";
    }

}
