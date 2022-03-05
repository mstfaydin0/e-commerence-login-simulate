package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;
import com.company.verificator.Email_verificator;

public class UserManager implements UserService {

    private User user;
    private UserDao userDao;
    private Email_verificator email_verificator;

    public UserManager(User user, UserDao userDao,Email_verificator email_verificator) {
        this.user = user;
        this.userDao = userDao;
        this.email_verificator=email_verificator;
    }

    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

    @Override
    public boolean isValidEmail(String email) {
        return email.matches(regex);
    }

    @Override
    public boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    @Override
    public boolean isValidFirstname(String firstName) {
        return firstName.length() >= 2;
    }
    @Override
    public boolean isValidLastname(String lastName) {
        return lastName.length() >= 2;
    }

    @Override
    public boolean isValidUser(User user) {
        return isValidEmail(user.getEmail()) &&
                isValidPassword(user.getPassword()) &&
                isValidFirstname(user.getFirsName())&&
                isValidLastname(user.getLastName());
    }

    @Override
    public void UserLoginControl(User user) {
            if(isValidUser(user)==false){
                System.out.println("User is not valid");
                return;
            }
        userDao.addUser(user);
            email_verificator.emailSend(user.getEmail());
    }
}
