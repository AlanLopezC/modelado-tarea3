package Ingredientes;
import PanBaguett.*;
public  class Jamon extends Ingrediente{


    public Jamon(Baguett baguett){
        super(baguett,10,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Jamon";
    }

    public String getTicket(){
        return baguett.getTicket() +"Jamon --- $10.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }


}