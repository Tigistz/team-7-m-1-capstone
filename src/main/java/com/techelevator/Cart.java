package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private double cartTotal;
    private double itemTotal;
    private List<Item> cartItems = new ArrayList<>();

    public void addToTheCart(Item itemToAdd){
        cartItems.add(itemToAdd);

    }



    public double getCartTotal() {
        cartTotal = 0.00;

        for (Item item : cartItems) {
            cartTotal += item.getPrice();
        }

        return cartTotal;
    }

    public void emptyCart(){
        cartItems.clear();
    }



    public List<Item> getCartItems() {
        return cartItems;
    }





}
