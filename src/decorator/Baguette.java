package decorator;

public abstract class Baguette {
    String description = "Unknown Baguette";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
