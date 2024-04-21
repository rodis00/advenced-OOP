package zad_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberReader implements Subject {
    List<Observer> observers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public NumberReader() {
    }

    void readNumber() {
        while (true) {
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                changeFilter();
                continue;
            }
            notifyObservers(userInput);
        }
    }

    private void changeFilter() {
        System.out.println("Choose option:");
        System.out.println("1. Number is greater than 0.");
        System.out.println("2. Number is equals 3.");
        System.out.println("3. Number is divisible by 2.");

        int filterOption = scanner.nextInt();

        while (true) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            boolean shouldNotify = false;

            switch (filterOption) {
                case 1:
                    if (number > 0)
                        shouldNotify = true;
                    break;
                case 2:
                    if (number == 3)
                        shouldNotify = true;
                    break;
                case 3:
                    if (number % 2 == 0)
                        shouldNotify = true;
                    break;
                default:
                    System.out.println("Invalid filter - " + filterOption);
                    break;
            }

            if (shouldNotify)
                notifyObservers(number);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int number) {
        for (Observer observer : observers) {
            observer.notify(number);
        }
    }
}
