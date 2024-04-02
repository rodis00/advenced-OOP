package zad_4;

public class Discount extends ProductDecorator {
    private double discount = 10;
    public Discount(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", discount: " + discount + " PLN";
    }

    public double getPrice() {
        double totalPrice = product.getPrice() - discount;
        return totalPrice < 0 ? 0 : totalPrice;
    }
}
