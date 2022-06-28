package com.example.demo1.Model.Login;

public class Medewerker {
    private String username;
    private String password;
    private boolean status;

    public Medewerker(String username, String password){
        this.password = password;
        this.username = username;
        this.status = false;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStatusIn() {
        this.status = true;
    }

    public void setStatusOut() {
        this.status = false;
    }
}
