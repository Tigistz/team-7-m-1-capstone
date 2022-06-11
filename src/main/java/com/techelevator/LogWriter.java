package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LogWriter {

    private FileWriter fileWriter;
    private File file = new File("C:\\Users\\Student\\source\\repos\\pairs\\team-7-m-1-capstone\\Log.txt");
    private BufferedWriter bufferedWriter;

    // LocalDateTime.now() method returns the instance of LocalDateTime class.
    //To format the current date, you can use DateTimeFormatter class
    // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.now();
    String nowTime = formatter.format(dateTime);


    public void logItem(Item itemToBeAdded, double currentBalance) {
        try {
            double price = itemToBeAdded.getPrice();
            fileWriter = new FileWriter(file, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(formatter.format(dateTime) + " " + itemToBeAdded.getQuantity() + " " + itemToBeAdded.getDescription() + " " + itemToBeAdded.getProductCode()+ " " + String.format("$%.2f", price) + " "  + String.format("$%.2f", currentBalance) + "\n");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();// TODO change later
        }
    }

    public void logAddMoney(double currentBalance, double moneyToAdd) {

        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //String header = String.format("%-15s%-25s%-10s%-10s", "Product Code", "Description", "Qty", "Price");
            bufferedWriter.write(formatter.format(dateTime) + "  ADD Money " + String.format("$%.2f", moneyToAdd) + " " +String.format("$%.2f", currentBalance)+ "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    public void logGiveChange(double currentBalance){
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(formatter.format(dateTime) + " GIVE CHANGE " + String.format("$%.2f", currentBalance) +" " + "$0.00"+ "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



