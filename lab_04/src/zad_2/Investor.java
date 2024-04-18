package zad_2;

public class Investor implements Observer{
    private String firstName;
    private String lastName;

    public Investor(
            String firstName,
            String lastName
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
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
