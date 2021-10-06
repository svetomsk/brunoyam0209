package lesson7;

import java.util.ArrayList;

public class Parking {
    ArrayList<Car> cars;

    public Parking() {
        cars = new ArrayList<>();
    }

    public void parkCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "cars=" + cars.toString() +
                '}';
    }
}
