package zad_2;

public class StandardShipping implements ShippingMethod {
    @Override
    public void ship() {
        System.out.println("Shipping with standard postal service.");
    }
}
