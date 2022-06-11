package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class InventoryTest {
    Inventory inventory = new Inventory();

//    public boolean isValidProductCode (String productCode) {
//
//    public boolean isEnoughToBuy(String productCode, int quantityRequested) {
//
//    public double getItemPrice(String productCode) {

    @Test
    public void isValidProductCodeTest(){
        // true condition
        Assert.assertTrue( inventory.isValidProductCode("A1"));
        Assert.assertTrue( inventory.isValidProductCode("B2"));
        Assert.assertTrue(inventory.isValidProductCode("D3"));
        Assert.assertTrue(inventory.isValidProductCode("E4"));

        // false condtions

        Assert.assertFalse(inventory.isValidProductCode("Q1"));
        Assert.assertFalse(inventory.isValidProductCode("A5"));
        Assert.assertFalse(inventory.isValidProductCode("a1"));

    }

    @Test
    public void isEnoughToBuyTest(){
        //true condition
        Assert.assertTrue(inventory.isEnoughToBuy("A1",25));
        Assert.assertTrue(inventory.isEnoughToBuy("B1",1));
        Assert.assertTrue(inventory.isEnoughToBuy("E1",15));

        // false

        Assert.assertFalse(inventory.isEnoughToBuy("A1",26));
        Assert.assertFalse(inventory.isEnoughToBuy("D1",50));


    }
    @Test
    public void getItemPriceTest(){
        // Appetizer
        Assert.assertEquals(1.50,inventory.getItemPrice("B1"),.001);
        Assert.assertEquals(8.85,inventory.getItemPrice("E1"),.001);
        Assert.assertEquals(3.50,inventory.getItemPrice("A1"),.001);
        Assert.assertEquals(2.55,inventory.getItemPrice("D1"),.001);

    }







}
