package decorator.Ingredientes;

import decorator.PanBaguette.Baguette;

public class Jitomate extends Ingrediente {

    public Jitomate(Baguette baguette) {
        super(baguette, 5, 3);
    }

    public String getDescripcion() {
        return baguette.getDescripcion() + ", Jitomate";
    }

    // public String getTicket() {
    // return baguette.getTicket() + "Jitomate --- $5.0\n";
    // }

    public float getCostoTotal() {
        return baguette.getCostoTotal() + costoIndividual;
    }

}