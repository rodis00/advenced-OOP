package zad_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exchange {
    private List<Observer> observers = new ArrayList<>();
    private List<Company> companies = new ArrayList<>();
    private Random random = new Random();

    void addCompany(Company company) {
        companies.add(company);
    }

    void simulateChanges() {
        for (Company company: companies) {
            double newPrice = company.getPrice() + random.nextDouble()  * 100;
            company.setPrice(newPrice);

            notifyObservers(company.getName(), company.getPrice());
        }
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(String name, double price) {
        for (Observer observer: observers) {
            observer.notify(name, price);
        }
    }
}
