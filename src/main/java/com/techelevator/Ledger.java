package com.techelevator;

import java.math.BigDecimal;

public class Ledger {
    private double currentBalance;
    private int[] changeToBeReturned;


    public Ledger() {
        this.currentBalance = 0.00;
    }

    public double changeCurrentBalance(double amountToChangeBy) {
        this.currentBalance = currentBalance + amountToChangeBy;
        return currentBalance;
    }



   public int[] changeToBeGiven(double balance, double cartCost) {


       int fiftyReturn = 0;
       int twentyReturn = 0;
       int tenReturn = 0;
       int fiveReturn = 0;
       int oneReturn = 0;
       int quarterReturn = 0;
       int dimeReturn = 0;
       int nickleReturn = 0;

       //BigDecimal amountONe = new BigDecimal (100.50)
       //BigDecimal amountTwo = new BigDecimal(200.50)
       //BigDecimal combinedAmount = amountOne.add(amountTwo)

//       BigDecimal test1 = new BigDecimal(balance);
//       BigDecimal test2 = new BigDecimal(34.67);
//       double test3 = test2.doubleValue();


       if (balance >= 50) {
           fiftyReturn = (int) balance / 50;
           BigDecimal balanceDecimal = new BigDecimal(balance);
           BigDecimal fiftyReturnDecimal = new BigDecimal(fiftyReturn);
           BigDecimal newBalanceResult = balanceDecimal.subtract(balanceDecimal.multiply(fiftyReturnDecimal));
           balance = newBalanceResult.doubleValue();

     }

           if (balance >= 20) {
               twentyReturn = (int) balance / 20;
               balance = balance - (twentyReturn * 20);

           }
           if (balance >= 10) {
               tenReturn = (int) balance / 10;
               balance = balance - (tenReturn * 10);

           }
           if (balance >= 5) {
               fiveReturn = (int) balance / 5;
               balance = balance - (fiveReturn * 5);

           }
           if (balance >= 1) {
               oneReturn = (int) balance / 1;
               balance = balance - (oneReturn * 1);

           }
           if (balance >= 0.25) {
               quarterReturn = (int) (balance / .25);
               balance = balance - (quarterReturn * .25);

           }
           if (balance >= 0.10) {
               dimeReturn = (int) (balance / .10);
               balance = balance - (dimeReturn * .10);

           }
           if (balance >= 0.05) {
               nickleReturn = (int) (balance / .05);
               balance = balance - (dimeReturn * .05);
           }


           int[] change = new int[]{fiftyReturn, twentyReturn, tenReturn, fiveReturn, oneReturn, quarterReturn, dimeReturn, nickleReturn};
           return change;

       }











    public double getCurrentBalance() {
        return currentBalance;
    }

    public int[] getChangeToBeReturned() {
        return changeToBeReturned;
    }
}
