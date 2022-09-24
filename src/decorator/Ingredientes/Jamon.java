package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Jamon extends Ingrediente {

    public Jamon(Baguette baguette) {
        super(baguette, 10, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Jamon";
    }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}