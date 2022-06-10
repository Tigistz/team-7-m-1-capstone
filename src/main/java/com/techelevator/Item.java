package com.techelevator;

public class Item {
    private String productCode;
    private double price;
    private int quantity;
    private String description;
    private String productType;

    public String getProductType() {
        return productType;
    }

    // order of file B|B1|Soda|1.50
    public Item(String productCode, String description, double price, int quantity){
        this.quantity = quantity;
        this.productCode= productCode;
        this.description = description;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }



    public String getDescription() {
        return description;
    }
}
