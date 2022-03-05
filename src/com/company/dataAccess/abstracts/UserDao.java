package com.company.dataAccess.abstracts;

import com.company.entities.concretes.User;

public interface UserDao {
    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
}
