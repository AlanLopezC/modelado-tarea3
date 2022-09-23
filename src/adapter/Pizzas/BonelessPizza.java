package adapter.Pizzas;

import adapter.Pizza;

public class BonelessPizza extends Pizza {
    public BonelessPizza() {
        this.ingredient = "";
        this.cheese = "manchego";
        this.meat = "boneless";
        this.dough = "thick dough";
        this.cost = 4.99;
    }
}
