package zad_2;

public class Investor implements Observer{
    private String firstName;
    private String lastName;
    private Subject subject;

    public Investor(
            String firstName,
            String lastName,
            Subject subject
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void notify(
            String name,
            double price
    ) {
        System.out.println("\nCompany updated.");
        System.out.println(name + " new price: " + price);
    }
}
