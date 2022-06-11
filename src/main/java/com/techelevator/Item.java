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
    public Item(String productType, String  productCode, String description, double price, int quantity){
        this.quantity = quantity;
        this.productCode= productCode;
        this.description = description;
        this.price = price;
        this.productType = productType;
    }
public String getMessage(){
        if (productType.equals("Appetizer")){
            return "You might need extra plates.";
        }
        if (productType.equals("Dessert")){
            return "Coffee goes with Dessert";
        }
        if (productType.equals("Entre")){
            return "Did you remember Dessert?";
        }
        else {
            return "Don't forget Ice.";
        }
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
