package com.pluralsight;

import java.util.Scanner;

//import java.util.Comparator;
public class Reports {
    int command;
    Scanner scanner = new Scanner(System.in);
Transactions transactions = new Transactions();












    public Reports(Scanner scanner) {
    do {
        System.out.println("Reports view: ");
        System.out.println("1) Month-Date");
        System.out.println("2) Previous Month");
        System.out.println("3) Year-Date");
        System.out.println("4) Previous Year");
        System.out.println("5) Search by Vendor");
        System.out.println("0) Back");
        System.out.println("Please enter your command:");
        command = scanner.nextInt();
        scanner.nextLine();
        switch (command) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 0:
                return;
            default:
                System.out.println("Invalid command. Please choose 1-5.");
        }
    } while (command != 5);

    }
//Transactions((c1, c2) -> c1.getDate().getMonthValue() - c2.getDate().getMonthValue());
//    //Display sorted results
//    for (Transactions c : dataHolder) {
//        System.out.println(c);
//        //Modify this to match how you'd like to display Contractor objects }
// //Sorting the list by the month of the date

}

