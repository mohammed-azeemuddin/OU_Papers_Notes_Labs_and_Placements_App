package com.azeem.ou_app2.RCV3;

import org.parceler.Parcel;

import java.io.Serializable;

@Parcel
public class UserModel implements Serializable {

    private String name;
    private String url;

    public UserModel(){

    }

    public UserModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
