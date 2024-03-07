package zad_3;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car(new CarName(), new CarSpeed());
        car.getName("BMW");
        car.getSpeed(5);
    }
}
