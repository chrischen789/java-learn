package com.chrischen.designpattern.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = new ChicagoStylePizza();
        }
        return pizza;
    }
}
