package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

public class UserHibernate implements UserDao {

    @Override
    public void addUser(User user) {
        System.out.println("User added: "+ user.getFirsName()+" "+user.getLastName());
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("User deleted: "+ user.getFirsName()+" "+user.getLastName());

    }

    @Override
    public void updateUser(User user) {
        System.out.println("User updated: "+user.getFirsName()+" "+user.getLastName());
    }

}
