package zad_1;

public class Main {
    public static void main(String[] args) {

        NumberReader numberReader = new NumberReader();

        PositiveNumber positiveNumber = new PositiveNumber(numberReader);
        NumberThree numberThree = new NumberThree(numberReader);
        EvenNumber evenNumber = new EvenNumber(numberReader);

        numberReader.readNumber();
    }
}
