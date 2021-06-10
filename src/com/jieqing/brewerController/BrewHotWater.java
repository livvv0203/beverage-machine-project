package com.jieqing.brewerController;

/**
 * This class contains status of the switch on brewing
 * Hot Water inside of the Brewer
 */
public class BrewHotWater implements Brewer {

    // By default the switch for brewing is always set off
    private Boolean switchOfHotWater = false;

    public void brew() {
        // When the selected beverage needs hot water
        switchOfHotWater = true;
        try {
            System.out.println("\nAdding Hot Water...");
            // Time consumed
            Thread.sleep(1000);
            System.out.println("\nDone.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switchOfHotWater = false;
    }
}
