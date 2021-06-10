package com.jieqing.beverageVendingMachine;

import com.jieqing.brewerController.BrewHotWater;
import com.jieqing.brewerController.BrewNoLiquid;

public class GreenTea extends Beverage {
    /**
     * This class shows the actions/recipe to brew Green Tea
     */
    public GreenTea() {
        super();
        this.setName("Green Tea");
        this.setPrice(2.75);

        this.brewFirstLiquid = new BrewHotWater();
        this.brewSecondLiquid = new BrewNoLiquid();
        this.brewThirdLiquid = new BrewNoLiquid();

        System.out.println("Brewing Green Tea...");
    }

}
