package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Jamon extends Ingrediente {

    public Jamon(Baguette baguette) {
        super(baguette, 10, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Jamon";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Jamon --- $10.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}