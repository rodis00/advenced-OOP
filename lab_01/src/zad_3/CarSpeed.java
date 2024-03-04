package zad_3;

public class CarSpeed {
    private Car car;

    public CarSpeed(Car car) {
        this.car = car;
    }

    public int getMaxSpeed() {
        return car.getMaxSpeed();
    }

    public void showCarName() {
        System.out.println(car.getCarName());
    }
}

