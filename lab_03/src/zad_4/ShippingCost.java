package zad_4;

public class ShippingCost extends ProductDecorator {
    public ShippingCost(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", Shipping Cost";
    }

    public double getPrice() {
        return product.getPrice() + 13.0;
    }
}
