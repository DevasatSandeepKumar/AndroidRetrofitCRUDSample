package com.example.smartron.retrofitdemo.model;

/**
 * Created by smartron on 11/10/17.
 */

public class User {


    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.userId = email;
        this.firstName = "Smartron";
        this.lastName = "Smartron";
        this.realm = "Smartron";
        this.serialNumber = "T5511BJ31671401367";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }


    private String serialNumber;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String realm;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String userId;
}
