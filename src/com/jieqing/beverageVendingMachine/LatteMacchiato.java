package com.jieqing.beverageVendingMachine;

import com.jieqing.brewerController.BrewEspresso;
import com.jieqing.brewerController.BrewMilk;
import com.jieqing.brewerController.BrewMilkFoam;

public class LatteMacchiato extends Beverage {
    /**
     * This class shows the actions/recipe to brew Latte Macchiato
     */
    public LatteMacchiato() {
        super();
        this.setName("Latte Macchiato");
        this.setPrice(5.25);

        this.brewFirstLiquid = new BrewEspresso();
        this.brewSecondLiquid = new BrewMilk();
        this.brewThirdLiquid = new BrewMilkFoam();
    }
}
