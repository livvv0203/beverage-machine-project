package com.jieqing.brewerController;
/**
 * This class contains status of the switch on brewing
 * Milk inside of the Brewer
 */
public class BrewMilk implements Brewer {

    // By default the switch for brewing is always set off
    private Boolean switchOfMilk = false;

    public void brew() {
        // When the selected beverage contains milk
        switchOfMilk = true;
        try {
            System.out.println("\nBrewing milk...");
            // Time consumed
            Thread.sleep(1000);
            System.out.println("\nDone.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switchOfMilk = false;
    }
}