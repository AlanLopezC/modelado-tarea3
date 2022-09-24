package decorator.PanBaguette;

public interface Baguette {

    /**
     * Método para obtener la descripción del Baguette.
     * @return String - Describe los ingredientes que tiene el Baguette. 
     */
    public String getDescripcion();
    
    /**
     * Método para obtener el costo total del Baguette.
     * @return float - Costo Total. 
     */
    public float getCostoTotal();

    /**
     * Método para obtener la cantidad máxima que se puede repetir el Baguette.
     * @return int - Cantidad máxima que se puede repetir un Baguette.
     */
    public int getRepeticionMaxIngrediente();

}