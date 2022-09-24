package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Pepperoni extends Ingrediente {

    public Pepperoni(Baguette baguette) {
        super(baguette, 12, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Peperoni";
    }
    
    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}