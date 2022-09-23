package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Mostaza extends Ingrediente {

    public Mostaza(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Mostaza";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Mostaza --- $3.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}