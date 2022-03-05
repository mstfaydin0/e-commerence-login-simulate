package com.company.google;

import com.company.entities.concretes.User;

public class UserGoogle {

    public void addWithGoogle(User user){
        System.out.println("Added With Google: "+user.getFirsName()+""+user.getLastName());
    }
    public void deleteWithGoogle(User user){
        System.out.println("Deleted With Google: "+user.getFirsName()+""+user.getLastName());
    }
    public void updateWithGoogle(User user){
        System.out.println("Updated With Google: "+user.getFirsName()+""+user.getLastName());
    }
}
