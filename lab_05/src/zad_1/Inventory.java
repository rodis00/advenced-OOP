package zad_1;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Subject {
    private List<Item> items = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        notifyObservers(item, getItemAmount(item));
    }

    public void removeItem(Item item) {
        items.remove(item);
        notifyObservers(item, getItemAmount(item));
    }

    public int getItemAmount(Item item) {
        return (int) items.stream()
                .filter(actualItem -> actualItem.getName().equals(item.getName()))
                .count();
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
    public void notifyObservers(Item item, int amount) {
        for (Observer observer : observers) {
            observer.update(item, amount);
        }
    }
}
