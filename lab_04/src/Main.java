public class Main {
    public static void main(String[] args) {

        NumberReader numberReader = new NumberReader();

        numberReader.addObserver(new PositiveNumber());
        numberReader.addObserver(new NumberThree());
        numberReader.addObserver(new EvenNumber());

        numberReader.readNumber();
    }
}
