package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public abstract class Ingrediente implements Baguette {

    protected Baguette baguette;
    protected float costoIndividual;
    protected int repeticionMaxIngrediente;

    /**
     * Método para crear un Ingrediente.
     * @param baguette - Tipo de Baguette.
     * @param costoIndividual - Costo del ingrediente.
     * @param repeticionMaxIngrediente - Cantidad máxima que puede ser agregado el ingrediente.
     */
    public Ingrediente(Baguette baguette, float costoIndividual, int repeticionMaxIngrediente) {
        this.baguette = baguette;
        this.costoIndividual = costoIndividual;
        this.repeticionMaxIngrediente = repeticionMaxIngrediente;
    }

    /**
     * Método para obtener la descripción del Ingrediente.
     * @return String - Descripción del Ingrediente.
     */
    public String getDescripcion() {
        return baguette.getDescripcion();
    }


    /**
     * Método para obtener el costo total de ingrediente.
     * @return float - Costo Total.
     */
    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

    /**
     * Método para obtener la cantidad máxima que se puede repetir el ingrediente.
     * @return int - Cantidad máxima que se puede repetir un ingrediente.
     */
    public int getRepeticionMaxIngrediente() {
        return repeticionMaxIngrediente;
    }

}