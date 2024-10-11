package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command;

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
        private static void addDeposit(Scanner scanner){

        }
        private static void addPayment(Scanner scanner){

        }
    }
