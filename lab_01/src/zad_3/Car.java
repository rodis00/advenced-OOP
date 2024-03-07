package zad_3;

public class Car{

    CarName carName;
    CarSpeed carSpeed;

    public Car(CarName carName, CarSpeed carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public void setCarName(CarName carName) {
        this.carName = carName;
    }

    public void setCarSpeed(CarSpeed carSpeed) {
        this.carSpeed = carSpeed;
    }

    void getName(String name) {
        System.out.println(carName.carName(name));
    }

    void getSpeed(int speed) {
        System.out.println(carSpeed.carSpeed(speed));
    }
}
