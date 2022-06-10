package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LedgerTest {
    Ledger ledger = new Ledger();
    @Test
    public void ledgerTestAdd(){

// from 0 to positive
        Assert.assertEquals(50.00, ledger.changeCurrentBalance(50.00), .001);

    }
    @Test
    public void ledgerTestSubtract(){
        ledger.changeCurrentBalance(50.00);
        // positive subtract by whole
        Assert.assertEquals(25.00, ledger.changeCurrentBalance(-25.00),.001);
        // positive subtract by non-whole
        Assert.assertEquals(.75, ledger.changeCurrentBalance(-24.25), .001);
    }

}