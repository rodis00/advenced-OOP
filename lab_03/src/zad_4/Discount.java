package zad_4;

public class Discount implements Product{
    private double discountAmount;

    public Discount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String getDescription() {
        return "Discount " + discountAmount + " PLN";
    }

    @Override
    public double getPrice() {
        return -discountAmount;
    }
}
