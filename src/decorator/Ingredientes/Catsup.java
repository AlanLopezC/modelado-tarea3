package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Catsup extends Ingrediente {

    public Catsup(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Catsup";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Catsup --- $3.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}