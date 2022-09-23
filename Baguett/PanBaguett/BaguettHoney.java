package PanBaguett;
public class BaguettHoney implements Baguett{

    private String descripcion = "Pan Miel";
    private float costo = 15;
    private int repeticionMaxIngrediente =1;

    public String getDescripcion(){
       return descripcion;
    }

    public String getTicket(){
        return "Pan Miel --- $15.0\n";
    }

    public float getCostoTotal(){
        return costo;
    }

    public int getRepeticionMaxIngrediente(){
        return repeticionMaxIngrediente;
    }
}