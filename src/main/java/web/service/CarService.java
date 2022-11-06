package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 100, "Blue"));
        cars.add(new Car("Mercedes", 200, "Black"));
        cars.add(new Car("Lada", 2108, "Green"));
        cars.add(new Car("Datsun", 2020, "White"));
        cars.add(new Car("Volvo", 2222, "Yellow"));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else if (count >= 0) {
            return cars.stream().limit(count).toList();
        } else {
            return null;
        }
    }
}