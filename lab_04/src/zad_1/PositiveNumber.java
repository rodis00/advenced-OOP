package zad_1;

public class PositiveNumber implements Observer {
    private Subject numberReader;

    public PositiveNumber(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.addObserver(this);
    }

    @Override
    public void notify(int number) {
        if (number > 0)
            System.out.println("Number: " + number + " is greater than 0.");
    }
}
