package com.example.retrofit.api.model;

public class Autentication {

    String action_code;

    public Autentication(String action_code) {
        this.action_code = action_code;

    }

    public String getAction_code() {
        return action_code;
    }

    public void setAction_code(String action_code) {
        this.action_code = action_code;
    }
}
