package com.example.pink.model;

public class User {

    private int id;
    private String name, email, password, mobile;

    public User(int id, String name, String email, String password, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getpassword() {
        return password;
    }

    public String getmobile() {
        return mobile;
    }

}
