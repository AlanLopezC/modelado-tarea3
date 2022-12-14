package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Mayonesa extends Ingrediente {

    public Mayonesa(Baguette baguette) {
        super(baguette, 3, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Mayonesa";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Mayonesa --- $3.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}