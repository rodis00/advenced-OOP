package zad_3;

public class PizzaMain {
    public static void main(String[] args) {

        Pizza pizza = new BasicPizza();
        System.out.printf("%s - %.2f%n", pizza.getDescription(), pizza.getCost());

        Pizza pizza2 = new CheeseDecorator(new BasicPizza());
        System.out.printf("%s - %.2f%n", pizza2.getDescription(), pizza2.getCost());

        Pizza pizza3 = new MushroomDecorator(new CheeseDecorator(new BasicPizza()));
        System.out.printf("%s - %.2f%n", pizza3.getDescription(), pizza3.getCost());
    }
}
