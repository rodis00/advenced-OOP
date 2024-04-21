package zad_1;

public class NumberThree implements Observer {
    private Subject numberReader;

    public NumberThree(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.addObserver(this);
    }

    @Override
    public void notify(int number) {
        if (number == 3)
            System.out.println("Given number is equals 3.");
    }
}
