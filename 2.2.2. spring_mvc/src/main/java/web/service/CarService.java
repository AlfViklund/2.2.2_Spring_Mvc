package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add( new Car("model1", "color1", 1));
        cars.add( new Car("model2", "color2", 2));
        cars.add( new Car("model3", "color3", 3));
        cars.add( new Car("model4", "color4", 4));
        cars.add( new Car("model5", "color5", 5));
    }

    public List<Car> getCars() { return cars;}

    public List<Car> getCarsByCount(int count) {
        return (List<Car>) cars.stream().limit(count < 5 ? (long) count : (long) cars.size()).collect(Collectors.toList());
    }
}
