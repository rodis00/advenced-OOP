package zad_3;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
