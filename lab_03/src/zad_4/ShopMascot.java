package zad_4;

public class ShopMascot extends ProductDecorator {
    public ShopMascot(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", Shop mascot";
    }

    public double getPrice() {
        return product.getPrice();
    }
}
