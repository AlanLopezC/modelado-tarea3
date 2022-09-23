package Ingredientes;
import PanBaguett.*;
public  class Pollo extends Ingrediente{

    public Pollo(Baguett baguett){
        super(baguett,15,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Pollo";
    }

    public String getTicket(){
        return baguett.getTicket() +"Pollo --- $15.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

 
}