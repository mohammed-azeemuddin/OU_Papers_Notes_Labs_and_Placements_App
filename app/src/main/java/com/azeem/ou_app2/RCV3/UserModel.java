package com.azeem.ou_app2.RCV3;

import java.io.Serializable;

public class UserModel implements Serializable {

    private String firstName;
    private String lastName;
    private String userPhone;

    public UserModel(String firstName, String lastName, String userPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPhone = userPhone;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
