package com.service;

import java.util.List;
import com.model.Car;
import com.model.Driver;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
