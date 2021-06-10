/**
 * Jieqing Liu
 * Boston University Design Pattern
 * Fully Automatic Beverage Vending Machine
 */
package com.jieqing.beverageVendingMachine;

import com.jieqing.brewerController.Brewer;
import java.util.Scanner;

public class Beverage {
    /**
     * This class contains information and details of all beverages
     */
    // Initialize the Beverage
    protected String name = "Selected Beverage";

    // Initialize the Price
    protected double price;

    // Initialize the recipe of the beverage
    protected Brewer brewFirstLiquid;
    protected Brewer brewSecondLiquid;
    protected Brewer brewThirdLiquid;

    public void brewBeverage() {
        /**
         * For calling the brew function
         */
        brewFirstLiquid.brew();
        brewSecondLiquid.brew();
        brewThirdLiquid.brew();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for the Brewer
    public Brewer getBrewFirstLiquid() {
        return brewFirstLiquid;
    }

    public void setBrewFirstLiquid(Brewer brewFirstLiquid) {
        this.brewFirstLiquid = brewFirstLiquid;
    }

    public Brewer getBrewSecondLiquid() {
        return brewSecondLiquid;
    }

    public void setBrewSecondLiquid(Brewer brewSecondLiquid) {
        this.brewSecondLiquid = brewSecondLiquid;
    }

    public Brewer getBrewThirdLiquid() {
        return brewThirdLiquid;
    }

    public void setBrewThirdLiquid(Brewer brewThirdLiquid) {
        this.brewThirdLiquid = brewThirdLiquid;
    }

    Scanner userInput = new Scanner(System.in);

    public int addMilk() {
        /**
         * The method add milk by user's preferences
         * It is set to return 0-3 units of milk
         */
        System.out.println("Would you like to add Extra Milk?");
        System.out.println("0 for NO || 1 for YES: ");

        while (true) {

            // Collect the selection of user about Milk
            int addMilk = userInput.nextInt();

            // User choose 1 to have extra milk
            if (addMilk == 1) {
                System.out.println("How many Units of Milk would you like?");
                while (true) {
                    System.out.println("You can add up to 3 units of milk: ");
                    int numberOfUnitMilk = userInput.nextInt();
                    if (numberOfUnitMilk > 0 && numberOfUnitMilk < 4) {
                        System.out.println("Okay," + numberOfUnitMilk + "unit(s) milk is added to your beverage.");
                        return numberOfUnitMilk;
                    }
                    else {
                        System.out.println("Invalid input, please try again: ");
                        continue;
                    }
                }
            }
            // User choose 0 to skip the selection
            else if (addMilk == 0) {
                return 0;
            }

            else {
                System.out.println("Invalid input in extra milk unit, please retry: ");
                continue;
            }
        }
    }

    public int addSugar() {
        /**
         * The method add sugar by user's preferences
         * It is set to return 0-3 units of sugar
         */
        System.out.println("Would you like to add Extra Sugar?");
        System.out.println("0 for NO || 1 for YES: ");

        while (true) {

            // Collect the selection of user about Sugar
            int addSugar = userInput.nextInt();

            // User choose 1 to have extra milk
            if (addSugar == 1) {
                System.out.println("How many Units of Sugar would you like?");
                while (true) {
                    System.out.println("You can add up to 3 units of sugar: ");
                    int numberOfUnitSugar = userInput.nextInt();
                    if (numberOfUnitSugar > 0 && numberOfUnitSugar < 4) {
                        System.out.println("Okay," + numberOfUnitSugar + "unit(s) sugar is added to your beverage.");
                        return numberOfUnitSugar;
                    }
                    else {
                        System.out.println("Invalid input, please try again: ");
                        continue;
                    }
                }
            }
            // User choose 0 to skip the selection
            else if (addSugar == 0) {
                return 0;
            }

            else {
                System.out.println("Invalid input in extra sugar unit, please retry: ");
                continue;
            }
        }
    }

    public double calculateTotalBeveragePrice(double beveragePrice, double milkPrice, double sugarPrice) {
        double totalBeveragePrice = beveragePrice + milkPrice + sugarPrice;
        return totalBeveragePrice;
    }



}







