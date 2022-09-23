package adapter;

import decorator.PanBaguette.Baguette;

/*
 * Class that adapts a Pizza into a Baguette.
 */
class PizzaAdapter implements Baguette {
    Pizza pizza;

    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    /*
     * Gives a description of all the pizza ingredients and its cost.
     * 
     * @return String The pizza complete description.
     */
    @Override
    public String getDescripcion() {
        return "Pizza with " + pizza.getIngredient() + ", " + pizza.getCheese() + ", " + pizza.getMeat() + ", "
                + pizza.getDough() + ", and costs: $" + pizza.getCost();
    }

    /*
     * Returns the cost of the pizza.
     * 
     * @return double The pizza cost.
     */
    @Override
    public float getCostoTotal() {
        return (float) pizza.getCost();
    }

    // @Override
    // public String getTicket() {
    // return getDescripcion();
    // }

    @Override
    public int getRepeticionMaxIngrediente() {
        return 1;
    }

}