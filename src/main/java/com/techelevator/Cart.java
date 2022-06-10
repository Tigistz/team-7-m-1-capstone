package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private double cartTotal;
    private double itemTotal;
    private  Map<Item, Integer> cartItems = new HashMap<>();

    public void addToTheCart(Item itemToAdd,int quantity){
        cartItems.put(itemToAdd,quantity);

    }
    


    public double getCartTotal(Map<Item , Integer> cartItems) {
        cartTotal = 0.00;
        for (Map.Entry<Item , Integer> item: cartItems.entrySet()){
           cartTotal = cartTotal + getItemTotal(item);
        }
        return cartTotal;
    }

    public void emptyCart(){
        for (Map.Entry<Item, Integer> entry : cartItems.entrySet()){
            cartItems.remove(entry);
        }
    }

    public double getItemTotal(Map.Entry<Item , Integer> cartItem) {
        double itemTotal = cartItem.getKey().getPrice()* cartItem.getValue();
        return itemTotal;
    }

    public Map<Item , Integer> getCartItems() {
        return cartItems;
    }





}
