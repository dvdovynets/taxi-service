package com.dao;

import java.util.List;
import com.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
