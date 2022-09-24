package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Pollo extends Ingrediente {

    public Pollo(Baguette baguette) {
        super(baguette, 15, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Pollo";
    }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}