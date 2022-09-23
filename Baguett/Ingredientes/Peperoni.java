package Ingredientes;
import PanBaguett.*;
public  class Peperoni extends Ingrediente{


    public Peperoni(Baguett baguett){
        super(baguett,12,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Peperoni";
    }

    public String getTicket(){
        return baguett.getTicket() +"Peperoni --- $12.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

    
}