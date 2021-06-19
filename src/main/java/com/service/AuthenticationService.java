package com.service;

import com.lib.exception.AuthenticationException;
import com.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
