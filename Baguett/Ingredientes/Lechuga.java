package Ingredientes;
import PanBaguett.*;
public  class Lechuga extends Ingrediente{

    public Lechuga(Baguett baguett){
        super(baguett,5,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Lechuga";
    }

    public String getTicket(){
        return baguett.getTicket() +"Lechuga --- $5.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

    
}