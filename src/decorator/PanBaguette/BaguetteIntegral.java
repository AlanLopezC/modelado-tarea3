package decorator.PanBaguette;

public class BaguetteIntegral implements Baguette {

    private String descripcion = "Pan Integral";
    private float costo = 12;
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