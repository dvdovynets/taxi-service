package com.dao;

import java.util.Optional;
import com.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
