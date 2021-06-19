package com.service;

import java.util.Optional;
import com.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
