package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public abstract class Ingrediente implements Baguette {

    protected Baguette baguette;
    protected float costoIndividual;
    protected int repeticionMaxIngrediente;

    public Ingrediente(Baguette baguette, float costoIndividual, int repeticionMaxIngrediente) {
        this.baguette = baguette;
        this.costoIndividual = costoIndividual;
        this.repeticionMaxIngrediente = repeticionMaxIngrediente;
    }

    public String getDescripcion() {
        return baguette.getDescripcion();
    }

    // public String getTicket() {
    // return baguette.getTicket();
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

    public int getRepeticionMaxIngrediente() {
        return repeticionMaxIngrediente;
    }

}