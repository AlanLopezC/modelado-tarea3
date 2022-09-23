package PanBaguett;
public class BaguettItaliano implements Baguett{

    private String descripcion = "Pan Italiano";
    private float costo = 25;
    private int repeticionMaxIngrediente =1;


    public String getDescripcion(){
       return descripcion;
    }

    public String getTicket(){
        return "Pan Italiano --- $20.0\n";
    }

    public float getCostoTotal(){
        return costo;
    }
    public int getRepeticionMaxIngrediente(){
        return repeticionMaxIngrediente;
    }
}