package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
        static final Transactions[] transactions = new Transactions[20];
        private static int transactionCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command;

//
        do {
            System.out.println("Would you like to ");
            System.out.println("1) Add Deposit");
            System.out.println("2) Make a Payment");
            System.out.println("3) Go to the Ledger");
            System.out.println("4) Exit");
            System.out.print("Please enter your command: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    addDeposit(scanner);
                    break;
                case 2:
                    addPayment(scanner);
                    break;
                case 3:
                    new Ledger(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye, Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid command. Please choose 1-4.");
            }
        } while (command != 4);

        scanner.close();

        }
    private static void addDeposit(Scanner scanner) {
        String filePath = " scr/transactions.csv ";
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss");
        String formatedDate = today.format(fmt);
        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Vendor: ");
        String vendor = scanner.nextLine();
        System.out.println("Amount: ");
        double amount = scanner.nextDouble();
        transactions[transactionCount] = new Transactions(formatedDate,description,vendor,amount);
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("src/transactions.csv"));
            br.write("\n" + Arrays.toString(transactions));
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    private static void addPayment(Scanner scanner){
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss");
        String formatedDate = today.format(fmt);
        System.out.println("16 digit card number: ");
        long cardNumber = scanner.nextLong();
        System.out.println("Experation date: ");
        String expoDate = scanner.nextLine();
        scanner.nextLine();
        System.out.println("3 digit security pin: ");
        int securityPin = scanner.nextInt();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Payment by: ");
        String vendor = scanner.nextLine();
        System.out.println("Amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Is this information correct: \n" + formatedDate + "|" + description + "|" + vendor + "|$" + amount);
        transactions[transactionCount++] = new Transactions(formatedDate, description, vendor, amount);
        System.out.println("Payment added successfully.");
    }
//

//public static void appendToFile(String filePath, String transactionRecord) {

}
