package zad_1;

public class NumberThree implements Observer{
    @Override
    public void notify(int number) {
        if (number == 3)
            System.out.println("Given number is equals 3.");
    }
}
