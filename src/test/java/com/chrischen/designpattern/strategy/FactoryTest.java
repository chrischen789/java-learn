package com.chrischen.designpattern.strategy;

import com.chrischen.designpattern.factory.ChicagoStylePizzaStore;
import com.chrischen.designpattern.factory.NYStylePizzaStore;
import com.chrischen.designpattern.factory.Pizza;
import com.chrischen.designpattern.factory.PizzaStore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryTest {

    private static final Logger log = LoggerFactory.getLogger(FactoryTest.class);

    @Test
    public void pizzaTest() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza chrischenPizza = nyStylePizzaStore.orderPizza("NYStylePizza");
        log.debug("chrischen get a {}", chrischenPizza.getName());

        Pizza jackPizza = chicagoStore.orderPizza("veggie");
        log.debug("jack get a {}", jackPizza.getName());
    }

}
