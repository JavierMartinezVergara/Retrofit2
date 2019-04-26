package com.example.retrofit.api.service;

import com.example.retrofit.api.model.Autentication;
import com.example.retrofit.api.model.GitHubRepo;
import com.example.retrofit.api.model.Results;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface GitHubClient {


    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);

    @GET("/ayvi_test/wms/lgfapi/v9/entity/")
    Call<Autentication> getActi(@Header("Authorization") String autenHeader);


    @GET("/ayvi_test/wms/lgfapi/v9/entity/facility/")
    Call<Results> getFacility(@Header("Authorization") String autenHeader);

}
