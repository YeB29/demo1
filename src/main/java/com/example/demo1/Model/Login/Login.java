package com.example.demo1.Model.Login;

import java.util.ArrayList;

public class Login {
    public static final ArrayList<Medewerker> users = new ArrayList<Medewerker>();

    public static Medewerker login(String username, String password){
        Check check = new Check();
        if(!check.checkUser(username, password)){
            return null;
        };
        for (Medewerker werknemer : users){
            if(werknemer.getUsername().equals(username) && werknemer.getPassword().equals(password)) {
                return werknemer;
            }
        }

        return null;
    }

}
