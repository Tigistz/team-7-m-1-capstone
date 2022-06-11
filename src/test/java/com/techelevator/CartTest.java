package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {
    Cart cart = new Cart();


    //public void addToTheCart(Item itemToAdd){

    @Test
    public void addToTheCartTest(){

        Item item = new Item("A", "A7","Somthing",4.99,25);
        cart.addToTheCart(item);
        Assert.assertSame(item,cart.getCartItems().get(0));

    }
    @Test
    public void emptyCart(){
        Item item = new Item("A", "A7","Somthing",4.99,25);
        cart.addToTheCart(item);
        cart.emptyCart();
        Assert.assertEquals(0,cart.getCartItems().size());
    }


   // public void emptyCart(){
}


