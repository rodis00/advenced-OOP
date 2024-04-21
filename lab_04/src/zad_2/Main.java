package zad_2;

public class Main {
    public static void main(String[] args) {

        Exchange exchange = new Exchange();

        exchange.addCompany(new Company("Google", 250.0));
        exchange.addCompany(new Company("Facebook", 220.0));
        exchange.addCompany(new Company("Amazon", 3000.0));

        Investor investor = new Investor("Jan", "Nowak", exchange);

        exchange.simulateChanges();

    }
}
