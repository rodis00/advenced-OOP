package zad_5;

public class GermanyTax implements TaxCalculator{
    @Override
    public double calculateTax(double price) {
        return price * 0.19;
    }
}
