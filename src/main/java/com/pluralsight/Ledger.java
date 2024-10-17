package com.pluralsight;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static com.pluralsight.Main.transactions;

public class Ledger{
    private static int trensationsCount;
    Scanner scanner = new Scanner(System.in);
    public Ledger(Scanner scanner) {
        int command;
        String filePath = "src/transactions.csv";
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
                case 3:
                case 4:
                case 0:
                    return;
                default:
                    System.out.println("Invalid command. Please choose 1-5.");
            }
        } while (command != 5);

    }

    private static void listAllTransactions() {
        try
        {
           BufferedReader reader = new BufferedReader(new FileReader("src/transactions.csv"));
             System.out.println(reader.readLine());
             reader.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }

    }


//    private static void allTransactions() {
//            if (transactions == 0) {
//                System.out.println("No vehicles available.");
//                return;
//            }
//            for (int i = 0; i < trensationsCount; i++) {
//                System.out.println(transatons[i]);
//            }
//        }
//try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
//        String line;
//
//        if ((line = br.readLine()) != null) {
//            // Optionally print the header
//
//        }
//        while ((line = br.readLine()) != null){
//            String[] data = line.split("\\|");
//
//            dateTime = Integer.parseInt(data[0]);
//            dicription = data[1];
//            vendor = Double.parseDouble(data[2]);
//            amount = Double.parseDouble(data[3]);
//
//            Transactions employee = new Transactions(dateTime, d, hoursWorked, payRate);
////                employees.add(employee);
//
//            System.out.printf("Employee ID: %d  Name: %s  Gross Pay: $%.2f%n",
//                    employee.getEmployeeID(),
//                    employee.getName(),
//                    employee.getGrossPay());
////        }
//    }catch (
//    IOException e){
//        System.out.println("Error reading the file: " + e.getMessage());
//    }

//    }for (int i = 0; i < invintory.size(); i++) {
//        Product p = inventory.get(i);
//        System.out.printf("id: %d %s - Price: $%.2f",
//                p.getId(), p.getName(), p.getPrice());
//    }    }    public ArrayList<Product>
}
