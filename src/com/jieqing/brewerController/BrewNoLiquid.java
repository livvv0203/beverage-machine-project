package com.jieqing.brewerController;
/**
 * This class indicates the Brewer's status when doing nothing
 */
public class BrewNoLiquid implements Brewer {
    public void brew() {
        // No more liquid to be added
        System.out.println("\nPlease wait...");
    }
}
