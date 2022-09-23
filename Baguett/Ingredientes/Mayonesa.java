package Ingredientes;
import PanBaguett.*;
public  class Mayonesa extends Ingrediente{

    public Mayonesa(Baguett baguett){
        super(baguett,3,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Mayonesa";
    }

    public String getTicket(){
        return baguett.getTicket() +"Mayonesa --- $3.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }


}