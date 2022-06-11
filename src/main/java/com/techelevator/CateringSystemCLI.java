package com.techelevator;


import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CateringSystemCLI {


    public static void main(String[] args) {
        CateringSystemCLI cli = new CateringSystemCLI();
        cli.run();
    }


    public void run() {
        //probably should do stuff here... ;-)
        // This is where call the stock inventory constructor
        //While loop that's going to start with a display menu
        Inventory inventory = new Inventory();
        UserInterface ui = new UserInterface();
        Ledger ledger = new Ledger();
        Cart cart = new Cart();

        boolean isRunning = true;

        while (isRunning) {
            // Call display menu
            String answer = ui.displayMainMenu();
            if (answer.equals("1")) {
                ui.displayCateringItems(inventory.getInventoryItems());
            }
            if (answer.equals(("2"))) {
                boolean subIsRunning = true;

                while (subIsRunning) {
                    double currentBalance = ledger.getCurrentBalance();
                    String subAnswer = ui.subMenu(currentBalance);
                    if (subAnswer.equals("1") || subAnswer.endsWith("2") || subAnswer.equals("3")) {
                        if (subAnswer.equals("1")) {
                            double moneyToAdd = ui.addMoney();
                            if (moneyToAdd + ledger.getCurrentBalance() <= 500) {
                                currentBalance = ledger.addFunds(moneyToAdd);


                            } else {
                                ui.displayErrorMessage("Your balance cannot exceed $500");
                            }

                        } else if (subAnswer.equals("2")) {
                            ui.displayCateringItems(inventory.getInventoryItems());
                            String productCode = ui.selectProduct();
                            if (inventory.isValidProductCode(productCode)) {
                                int amountToBuy = ui.quantityToPurchase();

                                //ask inventory class is there enough inventory to buy
                                if (inventory.isEnoughToBuy(productCode, amountToBuy)) {
                                    if (((amountToBuy * inventory.getItemPrice(productCode)) <= ledger.getCurrentBalance())){
                                    ledger.withdrawFunds(amountToBuy * inventory.getItemPrice(productCode));
                                    cart.addToTheCart(inventory.buildInventoryCartItem(productCode,amountToBuy));
                                    ui.displayMessage("Item " + productCode + " has been added");

//                                    if (((products.get(productCode).getPrice() * amountToBuy) + cart.getCartTotal(cart.getCartItems()) < ledger.getCurrentBalance())) {
//                                        products.get(productCode).setQuanity(products.get(productCode).getQuanity() - amountToBuy);
//                                        cart.addToTheCart(products.get(productCode), amountToBuy);
//                                        currentBalance = ledger.changeCurrentBalance(-(products.get(productCode).getPrice() * amountToBuy));
//                                        //TESTS
//                                        System.out.println(ledger.getCurrentBalance());
//                                        System.out.println(cart.getCartTotal(cart.getCartItems()));

                                } else {
                                    ui.displayErrorMessage("Your current balance cannot afford that additional item.");
                                }
                            } else {
                                ui.displayErrorMessage(" There is not enough stock for that purchase.");
                            }
                        } else {
                            ui.displayErrorMessage("That product does not exist");
                        }
                    } else if (subAnswer.equals("3")) {
                        List<Item> itemReceipt = cart.getCartItems();
                            int[] changeGiven = ledger.changeToBeGiven(ledger.getCurrentBalance());
                           ui.printReceipt(itemReceipt,changeGiven);
                            cart.emptyCart();
                            break;

                    } else {
                        ui.displayErrorMessage("That is not a valid option. Please make another selection");
                    }
                }


            }

        }


    }
}}

