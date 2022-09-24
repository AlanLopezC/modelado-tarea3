package adapter;

public abstract class Pizza {
    
    protected String ingredient;
    protected String cheese;
    protected String meat;
    protected String dough;
    protected double cost;

    /**
     * Método para obtener los ingredientes de la Pizza.
     * @return String - Ingredientes. 
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * Método para obtener el tipo de Queso. 
     * @return String - Tipo de Queso. 
     */
    public String getCheese() {
        return cheese;
    }

    /**
     * Método para obtener el tipo de Carne. 
     * @return String - Tipo de Carne. 
     */
    public String getMeat() {
        return meat;
    }

    /**
     * Método para obtener el tipo de Masa. 
     * @return String - Tipo de Masa.
     */
    public String getDough() {
        return dough;
    }

    /**
     * Método para obtener el costo total. 
     * @return double - Costo total. 
     */
    public double getCost() {
        return cost;
    }

}
