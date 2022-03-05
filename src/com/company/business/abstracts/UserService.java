package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface UserService {
    boolean isValidEmail(String email);

    boolean isValidPassword(String password);

    boolean isValidFirstname(String username);

    boolean isValidLastname(String username);

    boolean isValidUser(User user);

    void UserLoginControl(User user);
}
