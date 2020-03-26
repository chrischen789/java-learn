package com.chrischen.designpattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStylePizza extends Pizza {

    private static final Logger log = LoggerFactory.getLogger(ChicagoStylePizza.class);

    public ChicagoStylePizza() {
        name = "chicago style pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        log.debug("Cutting the pizza into square slices");
    }
}
