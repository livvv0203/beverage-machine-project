package com.jieqing.beverageVendingMachine;


import com.jieqing.brewerController.BrewHotWater;
import com.jieqing.brewerController.BrewNoLiquid;

public class YellowTea extends Beverage {
    /**
     * This class shows the actions/recipe to brew Yellow Tea
     */
    public YellowTea() {
        super();
        this.setName("Yellow Tea");
        this.setPrice(3.50);

        this.brewFirstLiquid = new BrewHotWater();
        this.brewSecondLiquid = new BrewNoLiquid();
        this.brewThirdLiquid = new BrewNoLiquid();

        System.out.println("Brewing Yellow Tea...");
    }

}

