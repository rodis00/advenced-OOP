package zad_3;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double getCost() {
        return pizza.getCost() + 3.85;
    }
}
