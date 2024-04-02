package zad_4;

public abstract class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    public abstract String getDescription();

    public abstract double getPrice();
}
