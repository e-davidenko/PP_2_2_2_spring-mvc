package web.service;

import web.model.Car;

import java.util.List;

/**
 * Created in Intellij
 * User: Davidenko
 * Date: 07.11.2022
 * Time: 11:02
 */

public interface CarService {
    List<Car> getCars(int count);
}
