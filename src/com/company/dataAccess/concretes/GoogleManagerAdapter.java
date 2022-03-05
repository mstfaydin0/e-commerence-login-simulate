package com.company.dataAccess.concretes;


import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;
import com.company.google.UserGoogle;

public class GoogleManagerAdapter implements UserDao {
    @Override
    public void addUser(User user) {
        UserGoogle userGoogle=new UserGoogle();
        userGoogle.addWithGoogle(user);
    }

    @Override
    public void deleteUser(User user) {
        UserGoogle userGoogle=new UserGoogle();
        userGoogle.deleteWithGoogle(user);
    }

    @Override
    public void updateUser(User user) {
        UserGoogle userGoogle=new UserGoogle();
        userGoogle.updateWithGoogle(user);
    }
}
