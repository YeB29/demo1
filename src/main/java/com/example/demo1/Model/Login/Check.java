package com.example.demo1.Model.Login;

public class Check {

    public Boolean checkUser(String username, String password){
        for (Medewerker user : Login.users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}
