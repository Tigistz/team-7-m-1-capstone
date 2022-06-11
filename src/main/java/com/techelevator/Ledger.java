package com.techelevator;

import java.math.BigDecimal;

public class Ledger {
    private double currentBalance;
    private int[] changeToBeReturned;


    public Ledger() {
        this.currentBalance = 0.00;
    }

    public double withdrawFunds(double amountToChangeBy) {
        this.currentBalance = this.currentBalance - amountToChangeBy;
        return this.currentBalance;
    }

    public double addFunds(double amountToChangeBy) {
        this.currentBalance = this.currentBalance + amountToChangeBy;
        return  this.currentBalance;
    }



   public int[] changeToBeGiven(double balance) {


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
           BigDecimal fifty = new BigDecimal(50);
           BigDecimal balanceDecimal = new BigDecimal(balance);
           BigDecimal fiftyReturnDecimal = new BigDecimal(fiftyReturn);
           BigDecimal remainder = balanceDecimal.subtract(fifty.multiply(fiftyReturnDecimal));
           BigDecimal newBalanceResult = remainder;
           balance = newBalanceResult.doubleValue();

     }

           if (balance >= 20) {
               twentyReturn = (int) balance / 20;
               BigDecimal twenty = new BigDecimal(20);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal twentyReturnDecimal = new BigDecimal(twentyReturn);
               BigDecimal remainder = balanceDecimal.subtract(twenty.multiply(twentyReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();
           }
           if (balance >= 10) {
               tenReturn = (int) balance / 10;
               BigDecimal ten = new BigDecimal(10);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal tenReturnDecimal = new BigDecimal(tenReturn);
               BigDecimal remainder = balanceDecimal.subtract(ten.multiply(tenReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();
           }
           if (balance >= 5) {
               fiveReturn = (int) balance / 5;
               BigDecimal five = new BigDecimal(5);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal fiveReturnDecimal = new BigDecimal(fiveReturn);
               BigDecimal remainder = balanceDecimal.subtract(five.multiply(fiveReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();
           }
           if (balance >= 1) {
               oneReturn = (int) balance / 1;
               BigDecimal one = new BigDecimal(1);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal oneReturnDecimal = new BigDecimal(oneReturn);
               BigDecimal remainder = balanceDecimal.subtract(one.multiply(oneReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();

           }
           if (balance >= 0.25) {
               quarterReturn = (int) (balance / .25);
               BigDecimal quarter = new BigDecimal(.25);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal quarterReturnDecimal = new BigDecimal(quarterReturn);
               BigDecimal remainder = balanceDecimal.subtract(quarter.multiply(quarterReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();
           }
           if (balance >= 0.10) {
               dimeReturn = (int) (balance / .10);
               BigDecimal dime = new BigDecimal(.10);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal dimeReturnDecimal = new BigDecimal(dimeReturn);
               BigDecimal remainder = balanceDecimal.subtract(dime.multiply(dimeReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();

           }
           if (balance >= 0.05) {
               nickleReturn = (int) (balance / .05);
               BigDecimal nickle = new BigDecimal(.05);
               BigDecimal balanceDecimal = new BigDecimal(balance);
               BigDecimal nickleReturnDecimal = new BigDecimal(nickleReturn);
               BigDecimal remainder = balanceDecimal.subtract(nickle.multiply(nickleReturnDecimal));
               BigDecimal newBalanceResult = remainder;
               balance = newBalanceResult.doubleValue();
           }


           int[] change = new int[]{fiftyReturn, twentyReturn, tenReturn, fiveReturn, oneReturn, quarterReturn, dimeReturn, nickleReturn};
          this.currentBalance = 0.00;
           return change;

       }











    public double getCurrentBalance() {
        return this.currentBalance;
    }

    public int[] getChangeToBeReturned() {
        return changeToBeReturned;
    }
}
