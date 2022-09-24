package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Catsup extends Ingrediente {

    public Catsup(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Catsup";
    }
    
    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}