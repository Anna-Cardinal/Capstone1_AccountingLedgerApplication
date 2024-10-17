package com.pluralsight;

import java.util.Scanner;

//import java.util.Comparator;
public class Reports {
    int command;
    Scanner scanner = new Scanner(System.in);
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
}