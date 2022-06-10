package com.techelevator;

public class Ledger {
 private    double currentBalance;
   private int[] changeToBeReturned;



   public Ledger(){
       this.currentBalance = 0.00;
   }

   public double changeCurrentBalance(double amountToChangeBy){
       this.currentBalance = currentBalance + amountToChangeBy;
       return currentBalance;
   }

   public int[] changeToBeGiven(double balance, double cartCost){
       double amountToBeGivenBack = balance - cartCost;
//138.55
       int fiftyReturn = (int)amountToBeGivenBack/50;
       double fiftyRemainder = amountToBeGivenBack%50;
       int twentyReturn = (int)fiftyRemainder/20;
       double twentyRemainder = twentyReturn%20;
       int tenReturn = (int)twentyRemainder/10;
       double tenRemainder = tenReturn%10;
       int fiveReturn = (int)tenRemainder/5;
       double fiveRemainder = fiveReturn%5;
       int oneReturn = (int)fiveRemainder/1;
       double oneRemainder = oneReturn%1;
       int quarterReturn = (int)(oneRemainder/.25);
       double quarterRemainder = (quarterReturn%.25);
       int dimeReturn = (int)(quarterRemainder/.10);
       double dimeRemainder = dimeReturn%.10;
       int nickleReturn = (int)(dimeRemainder/.05);
       double nickleRemainder = nickleReturn%.05;
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
