package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Cebolla extends Ingrediente {

    public Cebolla(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Cebolla";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Cebolla --- $3.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}