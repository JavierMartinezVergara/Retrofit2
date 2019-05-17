package com.example.retrofit.api.responses.DataBrowseF41021;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseF41021 {

    @SerializedName("fs_DATABROWSE_F41021")
    @Expose
    private FsDATABROWSEF41021 fsDATABROWSEF41021;
    @SerializedName("stackId")
    @Expose
    private Integer stackId;
    @SerializedName("stateId")
    @Expose
    private Integer stateId;
    @SerializedName("rid")
    @Expose
    private String rid;
    @SerializedName("currentApp")
    @Expose
    private String currentApp;
    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;
    @SerializedName("sysErrors")
    @Expose
    private List<Object> sysErrors = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseF41021() {
    }

    /**
     *
     * @param fsDATABROWSEF41021
     * @param sysErrors
     * @param stackId
     * @param currentApp
     * @param timeStamp
     * @param rid
     * @param stateId
     */
    public ResponseF41021(FsDATABROWSEF41021 fsDATABROWSEF41021, Integer stackId, Integer stateId, String rid, String currentApp, String timeStamp, List<Object> sysErrors) {
        super();
        this.fsDATABROWSEF41021 = fsDATABROWSEF41021;
        this.stackId = stackId;
        this.stateId = stateId;
        this.rid = rid;
        this.currentApp = currentApp;
        this.timeStamp = timeStamp;
        this.sysErrors = sysErrors;
    }

    public FsDATABROWSEF41021 getFsDATABROWSEF41021() {
        return fsDATABROWSEF41021;
    }

    public void setFsDATABROWSEF41021(FsDATABROWSEF41021 fsDATABROWSEF41021) {
        this.fsDATABROWSEF41021 = fsDATABROWSEF41021;
    }

    public Integer getStackId() {
        return stackId;
    }

    public void setStackId(Integer stackId) {
        this.stackId = stackId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCurrentApp() {
        return currentApp;
    }

    public void setCurrentApp(String currentApp) {
        this.currentApp = currentApp;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<Object> getSysErrors() {
        return sysErrors;
    }

    public void setSysErrors(List<Object> sysErrors) {
        this.sysErrors = sysErrors;
    }

}