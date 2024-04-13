public class PositiveNumber implements Observer {

    @Override
    public void notify(int number) {
        if (number > 0)
            System.out.println("Number: " + number + " is greater than 0.");
    }
}
