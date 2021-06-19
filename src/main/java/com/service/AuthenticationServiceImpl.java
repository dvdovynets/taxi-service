package com.service;

import java.util.Optional;
import com.lib.Inject;
import com.lib.Service;
import com.lib.exception.AuthenticationException;
import com.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Username or password was incorrect");
    }
}
