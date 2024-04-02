package zad_4;

public class Lanyard extends ProductDecorator {
    public Lanyard(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", Lanyard for pendrive";
    }

    public double getPrice() {
        return product.getPrice() + 8.0;
    }
}
