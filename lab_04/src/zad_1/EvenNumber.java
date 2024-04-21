package zad_1;

public class EvenNumber implements Observer {
    private Subject numberReader;

    public EvenNumber(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.addObserver(this);
    }

    @Override
    public void notify(int number) {
        if (number % 2 == 0)
            System.out.println("Number: " + number + " is divisible by 2.");
    }
}
