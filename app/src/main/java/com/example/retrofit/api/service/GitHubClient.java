package com.example.retrofit.api.service;

import com.example.retrofit.api.model.Autentication;
import com.example.retrofit.api.model.AutenticationJde;
import com.example.retrofit.api.model.GitHubRepo;
import com.example.retrofit.api.model.P0101;
import com.example.retrofit.api.model.P0101FormAction;
import com.example.retrofit.api.model.Results;
import com.example.retrofit.api.responses.Data_P0101_W01012B;
import com.example.retrofit.api.responses.FsP01012W01012B;
import com.example.retrofit.api.responses.GridData;
import com.example.retrofit.api.responses.Rowset;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GitHubClient {


    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);

    @GET("/ayvi_test/wms/lgfapi/v9/entity/")
    Call<Autentication> getActi(@Header("Authorization") String autenHeader);


    @GET("/ayvi_test/wms/lgfapi/v9/entity/facility/")
    Call<Results> getFacility(@Header("Authorization") String autenHeader);


    @POST("jderest/tokenrequest/")
    Call<AutenticationJde> getServer(@Body AutenticationJde autenticationJde);


    @POST("jderest/formservice/")
    Call<Data_P0101_W01012B> getValores(@Body P0101 p0101);
}
