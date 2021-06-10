package com.jieqing.beverageVendingMachine;

import com.jieqing.brewerController.BrewHotWater;
import com.jieqing.brewerController.BrewNoLiquid;

public class BlackTea extends Beverage {
    /**
     * This class shows the actions/recipe to brew Black Tea
     */
    public BlackTea() {
        super();
        this.setName("Black Tea");
        this.setPrice(3.00);

        this.brewFirstLiquid = new BrewHotWater();
        this.brewSecondLiquid = new BrewNoLiquid();
        this.brewThirdLiquid = new BrewNoLiquid();

        System.out.println("Brewing Black Tea...");
    }

}
