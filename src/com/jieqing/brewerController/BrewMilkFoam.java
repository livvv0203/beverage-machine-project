package com.jieqing.brewerController;
/**
 * This class contains status of the switch on brewing
 * Milk Foam inside of the Brewer
 */
public class BrewMilkFoam implements Brewer {

    // By default the switch for brewing is always set off
    private Boolean switchOfMilkFoam = false;

    public void brew() {
        // When the selected beverage contains milk foam
        switchOfMilkFoam = true;
        try {
            System.out.println("\nBrewing Milk Foam...");
            // Time consumed
            Thread.sleep(2000);
            System.out.println("\nDone.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switchOfMilkFoam = false;
    }
}