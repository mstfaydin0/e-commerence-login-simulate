package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.dataAccess.concretes.GoogleManagerAdapter;
import com.company.entities.concretes.User;
import com.company.verificator.Email_verificator;

public class Main {

    public static void main(String[] args) {
        User user=new User(201,"Mustafa Muharrem","Aydın","mustafamuharremaydin@gmail.com","123456789");
        UserService userService=new UserManager(user,new GoogleManagerAdapter(),new Email_verificator());
        userService.UserLoginControl(user);
    }
}
