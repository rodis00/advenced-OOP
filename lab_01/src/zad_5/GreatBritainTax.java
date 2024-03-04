package zad_5;

public class GreatBritainTax implements TaxCalculator{
    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
