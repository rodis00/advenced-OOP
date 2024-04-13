public class EvenNumber implements Observer{
    @Override
    public void notify(int number) {
        if (number % 2 == 0)
            System.out.println("Number: " + number + " is divisible by 2.");
    }
}
