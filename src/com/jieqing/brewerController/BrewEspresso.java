package com.jieqing.brewerController;

/**
 * This class contains status of the switch on brewing
 * Espresso inside of the Brewer
 */
public class BrewEspresso implements Brewer {

    // By default the switch for brewing is always set off
    private Boolean switchOfEspresso = false;

    public void brew() {
        // When the selected beverage contains espresso
        switchOfEspresso = true;
        try {
            System.out.println("\nBrewing Espresso...");
            // Time consumed
            Thread.sleep(1000);
            System.out.println("\nDone.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switchOfEspresso = false;
    }
}




