package Ingredientes;
import PanBaguett.*;
public  class Catsup extends Ingrediente{
    
    public Catsup(Baguett baguett){
        super(baguett,3,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Catsup";
    }

    public String getTicket(){
        return baguett.getTicket() +"Catsup --- $3.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

}