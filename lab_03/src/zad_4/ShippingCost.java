package zad_4;

public class ShippingCost implements Product{
    @Override
    public String getDescription() {
        return "Shipping cost";
    }

    @Override
    public double getPrice() {
        return 13.0;
    }
}
