package zad_5;

public class Shop {
    private TaxCalculator taxCalculator;

    public Shop(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double calculateTax(double price) {
        return taxCalculator.calculateTax(price);
    }
}
