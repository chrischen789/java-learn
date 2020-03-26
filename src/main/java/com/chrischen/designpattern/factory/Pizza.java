package com.chrischen.designpattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private static final Logger log = LoggerFactory.getLogger(Pizza.class);

    String name;

    String dough;

    String sauce;

    List<String> toppings = new ArrayList<>();

    void prepare() {
        log.debug("Preparing {}", name);
        log.debug("Tossing dough...");
        log.debug("Adding sauce...");
        log.debug("Adding toppings: ");
        for (int i = 0; i < this.toppings.size(); i++) {
            log.debug(" - {} ", toppings.get(i));
        }
    }

    void bake() {
        log.debug("Bake for 25mis at 350");
    }

    void cut() {
        log.debug("Cutting the pizza into diagonal slices");
    }

    void box() {
        log.debug("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
