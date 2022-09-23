package Ingredientes;
import PanBaguett.*;
public  class Jitomate extends Ingrediente{
    
    public Jitomate(Baguett baguett){
        super(baguett,5,3);
    }

    public String getDescripcion(){
        return baguett.getDescripcion() + ", Jitomate";
    }

    public String getTicket(){
        return baguett.getTicket() +"Jitomate --- $5.0\n";
    }

    public float getCostoTotal(){
        return baguett.getCostoTotal()  + costoIndividual;
    }

}