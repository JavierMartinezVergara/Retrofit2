package com.example.retrofit.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results {

    private List<FacilitiesModel> results;

    public Results(List<FacilitiesModel> results) {
        this.results = results;
    }

    public List<FacilitiesModel> getResults() {
        return results;
    }
}

