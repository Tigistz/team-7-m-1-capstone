package com.techelevator;

public class Item {
    private String productCode;
    private double price;
    private int quanity;
    private String description;


    
    // order of file B|B1|Soda|1.50
    public Item(String productCode, String description, double price){
        this.quanity = 25;
        this.productCode= productCode;
        this.description = description;
        this.price = price;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public int getQuanity() {
        return quanity;
    }

    public String getDescription() {
        return description;
    }
}
