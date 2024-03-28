package zad_4;

public class Lanyard implements Product{
    @Override
    public String getDescription() {
        return "Lanyard for pendrive";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
