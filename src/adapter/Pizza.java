package adapter;

/*
 * Template for a pizza class.
 */
public abstract class Pizza {
    protected String ingredient;
    protected String cheese;
    protected String meat;
    protected String dough;
    protected double cost;

    public String getIngredient() {
        return ingredient;
    }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }

    public String getDough() {
        return dough;
    }

    public double getCost() {
        return cost;
    }

}
