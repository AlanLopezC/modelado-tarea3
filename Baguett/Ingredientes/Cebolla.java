package Ingredientes;
import PanBaguett.*;
public  class Cebolla extends Ingrediente{
    
    public Cebolla(Baguett baguett){
        super(baguett,3,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Cebolla";
    }

    public String getTicket(){
        return baguett.getTicket() +"Cebolla --- $3.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

}