package decorator.PanBaguette;

public class BaguetteHoney implements Baguette {

    private String descripcion = "Pan Miel";
    private float costo = 15;
    private int repeticionMaxIngrediente = 1;

    public String getDescripcion() {
        return descripcion;
    }

    public float getCostoTotal() {
        return costo;
    }

    public int getRepeticionMaxIngrediente() {
        return repeticionMaxIngrediente;
    }
}