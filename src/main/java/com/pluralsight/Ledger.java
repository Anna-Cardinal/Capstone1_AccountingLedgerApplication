package com.pluralsight;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.regex.Pattern;


public class Ledger{
    private static int trensationsCount;
    Scanner scanner = new Scanner(System.in);
    public Ledger(Scanner scanner) {
        int command;

        do {
            System.out.println("Would you like to see: ");
            System.out.println("1) All");
            System.out.println("2) Deposits");
            System.out.println("3) Payments");
            System.out.println("4) Reports");
            System.out.println("0) Home");
            System.out.println("Please enter your command:");
            command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1:
                    listAllTransactions();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    new Reports(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid command. Please choose 1-5.");
            }
        } while (command != 5);

    }

    public static void listAllTransactions() {
        try {
            String filePath = "C:\\Users\\annac\\Anna\\GitHub\\Capstone1_AccountingLedgerApplication\\src\\test\\java\\transactions.csv";
           BufferedReader reader = new BufferedReader(new FileReader(filePath));
             String line;
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }
             reader.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }

    }
    public static void searchByPrice(double amount, Transactions stuff) {
        try {
            String filePath = "C:\\Users\\annac\\Anna\\GitHub\\Capstone1_AccountingLedgerApplication\\src\\test\\java\\transactions.csv";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] array = line.split("\\|");
                LocalDate date = LocalDate.parse(array[0]);
                LocalTime time = LocalTime.parse(array[1]);
                String des = array[2];
                String v = array[3];
                double amo = Double.parseDouble(array[4]);

                Transactions pay = new Transactions(date)
            }
            reader.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }



//        if (amount < 0){
//
//    }
//        boolean found = false;
//        for (Transactions transactions : ) {
//            if (transactions != null && transactions.getAmount() >= amount && transactions.getAmount() <= amount) {
//                System.out.println();
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("No vehicles found in the price range: " + minPrice + " - " + maxPrice);
//        }
    }

//    }for (int i = 0; i < invintory.size(); i++) {
//        Product p = inventory.get(i);
//        System.out.printf("id: %d %s - Price: $%.2f",
//                p.getId(), p.getName(), p.getPrice());
//    }    }    public ArrayList<Product>
}
