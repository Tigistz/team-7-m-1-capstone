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








    public double getCurrentBalance() {
        return currentBalance;
    }

    public int[] getChangeToBeReturned() {
        return changeToBeReturned;
    }
}
