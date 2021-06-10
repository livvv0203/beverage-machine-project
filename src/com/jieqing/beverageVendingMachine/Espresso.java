package com.jieqing.beverageVendingMachine;

import com.jieqing.brewerController.BrewEspresso;
import com.jieqing.brewerController.BrewNoLiquid;

public class Espresso extends Beverage {
    /**
     * This class shows the actions to brew Espresso
     */
    public Espresso() {
        super();
        this.setName("Espresso");
        this.setPrice(4.50);

        this.brewFirstLiquid = new BrewEspresso();
        this.brewSecondLiquid = new BrewNoLiquid();
        this.brewThirdLiquid = new BrewNoLiquid();
    }

}
