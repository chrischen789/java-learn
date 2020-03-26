package com.chrischen.designpattern.factory;

public class NYStylePizza extends Pizza {

    public NYStylePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
