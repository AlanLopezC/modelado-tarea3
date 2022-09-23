package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Lechuga extends Ingrediente {

    public Lechuga(Baguette baguette) {
        super(baguette, 5, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Lechuga";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Lechuga --- $5.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}