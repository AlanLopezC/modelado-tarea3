package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Mostaza extends Ingrediente {

    public Mostaza(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Mostaza";
    }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}