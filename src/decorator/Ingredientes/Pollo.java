package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Pollo extends Ingrediente {

    public Pollo(Baguette baguette) {
        super(baguette, 15, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Pollo";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Pollo --- $15.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}