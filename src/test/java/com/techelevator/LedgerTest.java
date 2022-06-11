package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LedgerTest {
    Ledger ledger = new Ledger();
    @Test
    public void ledgerTestAdd(){

// from 0 to positive
        // whole number
Assert.assertEquals(100, ledger.addFunds(100), .001);
// partial number
        Assert.assertEquals(105.3,ledger.addFunds(5.30),.001);

    }
    @Test
    public void ledgerTestSubtract(){

        ledger.addFunds(100);
        // whole number
        Assert.assertEquals(50.00,ledger.withdrawFunds(50),.001);

        //patial number
        Assert.assertEquals(20.5,ledger.withdrawFunds(29.5),.001);
    }

    @Test
    public void changeToBeGivenTest(){



        Assert.assertArrayEquals(new int[]{1,1,1,1,1,1,1,1}, ledger.changeToBeGiven(86.40));



        Assert.assertArrayEquals(new int[] {0,0,0,0,0,0,0,0}, ledger.changeToBeGiven(0.00));

    }

}
