package adapter;

import decorator.PanBaguette.Baguette;

/**
 * Clase que adapta una Pizza a una Baguette.
 */
public class PizzaAdapter implements Baguette {
    Pizza pizza;

    /**
     * Método para crear un objeto que envuelva a una Pizza.
     * @param pizza - Pizza a envolver.
     */
    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Da una descripción de todos los ingredientes de la pizza y su costo.
     * @return String - La pizza descripción completa.
     */
    @Override
    public String getDescripcion() {
        return "Pizza con " + pizza.getIngredient() + ", " + pizza.getCheese() + ", " + pizza.getMeat() + ", "
                + pizza.getDough();
    }

    /**
     * Devuelve el costo de la pizza.
     * @return double - El precio de la pizza.
     */
    @Override
    public float getCostoTotal() {
        return (float) pizza.getCost();
    }

    /**
     * Método para obtener la cantidad máxima que se puede repetir la pizza.
     * @return int - Cantidad máxima que se puede repetir la pizza. 
     */
    @Override
    public int getRepeticionMaxIngrediente() {
        return 1;
    }

}