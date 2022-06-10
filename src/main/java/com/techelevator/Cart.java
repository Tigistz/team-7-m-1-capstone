package com.techelevator;

import java.util.Map;

public class Cart {
    private double cartTotal;
    private double itemTotal;
    private Map<Item, Integer> cartItems;

    public void addToTheCart(Item itemToAdd,int quantity){
        cartItems.put(itemToAdd,quantity);

    }
    


    public double getCartTotal(Map<Item , Integer> finalCart) {
        cartTotal = 0.00;
        for (Map.Entry<Item , Integer> item: finalCart.entrySet()){
           cartTotal = cartTotal + getItemTotal(item);
        }
        return cartTotal;
    }

    public double getItemTotal(Map.Entry<Item , Integer> cartItem) {
        double itemTotal = cartItem.getKey().getPrice()* cartItem.getValue();
        return itemTotal;
    }

    public Map<Item , Integer> getCartItems() {
        return cartItems;
    }





}
