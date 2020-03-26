package com.chrischen.designpattern.factory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "NYStylePizza":
                pizza = new NYStylePizza();
                break;
        }
        return pizza;
    }
}
