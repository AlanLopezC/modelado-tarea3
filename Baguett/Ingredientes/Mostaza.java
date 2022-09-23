package Ingredientes;
import PanBaguett.*;
public  class Mostaza extends Ingrediente{

    public Mostaza(Baguett baguett){
        super(baguett,3,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Mostaza";
    }

    public String getTicket(){
        return baguett.getTicket() +"Mostaza --- $3.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

    
}