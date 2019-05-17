package com.example.retrofit.api.model.F41021;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class F41021{

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("deviceName")
    @Expose
    private String deviceName;
    @SerializedName("targetName")
    @Expose
    private String targetName;
    @SerializedName("targetType")
    @Expose
    private String targetType;
    @SerializedName("dataServiceType")
    @Expose
    private String dataServiceType;
    @SerializedName("returnControlIDs")
    @Expose
    private String returnControlIDs;
    @SerializedName("query")
    @Expose
    private Query query;

    /**
     * No args constructor for use in serialization
     *
     */
    public F41021() {
    }

    /**
     *
     * @param deviceName
     * @param token
     * @param query
     * @param returnControlIDs
     * @param targetName
     * @param dataServiceType
     * @param targetType
     */
    public F41021(String token, String deviceName, String targetName, String targetType, String dataServiceType, String returnControlIDs, Query query) {
        super();
        this.token = token;
        this.deviceName = deviceName;
        this.targetName = targetName;
        this.targetType = targetType;
        this.dataServiceType = dataServiceType;
        this.returnControlIDs = returnControlIDs;
        this.query = query;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getDataServiceType() {
        return dataServiceType;
    }

    public void setDataServiceType(String dataServiceType) {
        this.dataServiceType = dataServiceType;
    }

    public String getReturnControlIDs() {
        return returnControlIDs;
    }

    public void setReturnControlIDs(String returnControlIDs) {
        this.returnControlIDs = returnControlIDs;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

}