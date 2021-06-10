package com.jieqing.beverageVendingMachine;


import com.jieqing.brewerController.BrewEspresso;
import com.jieqing.brewerController.BrewHotWater;
import com.jieqing.brewerController.BrewNoLiquid;

public class Americano extends Beverage {
    /**
     * This class shows the actions to brew Americano
     */
    public Americano() {
        super();
        this.setName("Americano");
        this.setPrice(3.75);

        this.brewFirstLiquid = new BrewEspresso();
        this.brewSecondLiquid = new BrewHotWater();
        this.brewThirdLiquid = new BrewNoLiquid();
    }

}
