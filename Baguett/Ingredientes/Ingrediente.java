package Ingredientes;
import PanBaguett.*;
public abstract class Ingrediente implements Baguett{

    protected Baguett baguett;
    protected float costoIndividual; 
    protected int repeticionMaxIngrediente;

    public Ingrediente(Baguett baguett, float costoIndividual, int repeticionMaxIngrediente){
        this.baguett = baguett;
        this.costoIndividual = costoIndividual;
        this.repeticionMaxIngrediente = repeticionMaxIngrediente;
    }

    public String getDescripcion(){
        return baguett.getDescripcion();
    }

    public String getTicket(){
        return baguett.getTicket();
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }
    
    public int getRepeticionMaxIngrediente(){
        return repeticionMaxIngrediente;
    }



    
    

    
}