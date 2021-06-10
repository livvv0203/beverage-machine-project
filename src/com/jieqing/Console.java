package com.jieqing;

import com.jieqing.beverageVendingMachine.*;

import java.util.Scanner;

public class Console {

    static void displayMenu() {
        System.out.println("Welcome to this ultimated Beverage Machine.");
        System.out.println("Below is a list of the up-to-date beverages menu with prices: \n");

        System.out.println("Coffee: ");
        System.out.println("1. Espresso---------------$4.50");
        System.out.println("2. Americano--------------$3.75");
        System.out.println("3. Latte Macchiato--------$5.25");

        System.out.println("Tea: ");
        System.out.println("4. Black Tea--------------$3.00");
        System.out.println("5. Green Tea--------------$2.75");
        System.out.println("6. Yellow Tea-------------$3.50 \n");

        System.out.println("Options for extra condiments:"  );
        System.out.println("Extra MILK per unit-------$0.50");
        System.out.println("Extra SUGAR per unit------$0.30");

        System.out.println("Please enter the beverage number you would like to purchase: ");
    }

    static void handleInput() {

        // Prompt the user to select a beverage
        Scanner userInput = new Scanner(System.in);

        while (true) {
            int product = userInput.nextInt();

            if (product == 1) {
                Beverage espresso = new Espresso();
                creatingBeverage(espresso);
                break;
            } else if (product == 2) {
                Beverage americano = new Americano();
                creatingBeverage(americano);
                break;
            } else if (product == 3) {
                Beverage latteMacchiato = new LatteMacchiato();
                creatingBeverage(latteMacchiato);
                break;
            } else if (product == 4) {
                Beverage blackTea = new BlackTea();
                creatingBeverage(blackTea);
                break;
            } else if (product == 5) {
                Beverage greenTea = new GreenTea();
                creatingBeverage(greenTea);
                break;
            } else if (product == 6) {
                Beverage yellowTea = new YellowTea();
                creatingBeverage(yellowTea);
                break;
            } else {
                System.out.println("Not a valid number, please enter again: ");
                continue;
            }
        }
    }

    private static void creatingBeverage(Beverage beverageName) {
        /**
         * Method for generating the beverages inside of the machine
         * by user's preferences on milk and sugar
         */

        beverageName.brewBeverage();
        // Ask for the condiments requirements about Milk
        int numberOfUnitMilk = beverageName.addMilk();

        // Calculate Added Milk Price
        double milkPrice = 0.50 * numberOfUnitMilk;

        // Ask for the condiments requirements about Sugar
        int numberOfUnitSugar = beverageName.addSugar();

        // Calculate Extra Sugar Price
        double sugarPrice = 0.30 * numberOfUnitSugar;
        double beveragePrice = beverageName.getPrice();

        System.out.println("\nMission Completed. " + "Your total is $" +
                beverageName.calculateTotalBeveragePrice(beveragePrice, milkPrice, sugarPrice) + ". " +
                "Enjoy your beverage!\n");
        System.out.println("=========================================================================\n");
    }

}
