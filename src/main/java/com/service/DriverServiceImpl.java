package com.service;

import java.util.List;
import java.util.Optional;
import com.dao.DriverDao;
import com.lib.Inject;
import com.lib.Service;
import com.model.Driver;

@Service
public class DriverServiceImpl implements DriverService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Driver get(Long id) {
        return driverDao.get(id).get();
    }

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }

    public Optional<Driver> findByLogin(String login) {
        return driverDao.findByLogin(login);
    }
}
