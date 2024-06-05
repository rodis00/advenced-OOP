package zad_2;

public class CourierShipping implements ShippingMethod{
    @Override
    public void ship() {
        System.out.println("Shipping with courier service.");
    }
}
