package adapter;

import decorator.Baguette;

class PizzaAdapter extends Baguette {
    Pizza pizza;

    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Pizza with " + pizza.getIngredient() + ", " + pizza.getCheese() + ", " + pizza.getMeat() + ", "
                + pizza.getDough() + ", and costs: $" + pizza.getCost();
    }

    @Override
    public double cost() {
        return pizza.getCost();
    }

}