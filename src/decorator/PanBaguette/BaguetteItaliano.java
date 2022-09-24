package decorator.PanBaguette;

public class BaguetteItaliano implements Baguette {

    private String descripcion = "Pan Italiano";
    private float costo = 25;
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