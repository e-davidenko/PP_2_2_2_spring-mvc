package web.model;

import java.util.List;

public class Car {
    private String model;

    private int series;

    private String color;

    public List<Car> cars;


    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }
}
