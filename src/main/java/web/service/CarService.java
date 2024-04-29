package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "volga", 0));
        cars.add(new Car(2, "jeep", 99999));
        cars.add(new Car(3, "mercedes", 12345));
        cars.add(new Car(4, "oka", 2033));
        cars.add(new Car(5, "tesla", 326235));
    }

    public List<Car> getCars(Integer count) {

        int request = 0;

        if (count == null || count > cars.size()) {
            request = cars.size();
        } else if (count > 0) {
            request = count;
        }

        List<Car> requestingCars = new ArrayList<>();

        for (int i = 0; i < request; i++) {
            requestingCars.add(cars.get(i));
        }
        return requestingCars;
    }
}