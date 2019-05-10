package com.example.retrofit.api.model;

import com.google.gson.annotations.SerializedName;

public class FacilitiesModel {

    @SerializedName("id")
    private int fId;
    @SerializedName("city")
    private String fCity;
    @SerializedName("state")
    private String fState;
    @SerializedName("country")
    private String fCountry;

    public FacilitiesModel(int id, String city, String state, String country) {
        fId = id;
        fCity = city;
        fState = state;
        fCountry = country;
    }



    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfCity() {
        return fCity;
    }

    public void setfCity(String fCity) {
        this.fCity = fCity;
    }

    public String getfState() {
        return fState;
    }

    public void setfState(String fState) {
        this.fState = fState;
    }

    public String getfCountry() {
        return fCountry;
    }

    public void setfCountry(String fCountry) {
        this.fCountry = fCountry;
    }
}
