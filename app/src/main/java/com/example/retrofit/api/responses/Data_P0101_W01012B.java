package com.example.retrofit.api.responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_P0101_W01012B {

@SerializedName("fs_P01012_W01012B")
@Expose
private FsP01012W01012B fsP01012W01012B;
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
@SerializedName("deprecated")
@Expose
private Boolean deprecated;

/**
* No args constructor for use in serialization
*
*/
public Data_P0101_W01012B() {
}

/**
*
* @param deprecated
* @param sysErrors
* @param stackId
* @param currentApp
* @param timeStamp
* @param rid
* @param stateId
* @param fsP01012W01012B
*/
public Data_P0101_W01012B(FsP01012W01012B fsP01012W01012B, Integer stackId, Integer stateId, String rid, String currentApp, String timeStamp, List<Object> sysErrors, Boolean deprecated) {
super();
this.fsP01012W01012B = fsP01012W01012B;
this.stackId = stackId;
this.stateId = stateId;
this.rid = rid;
this.currentApp = currentApp;
this.timeStamp = timeStamp;
this.sysErrors = sysErrors;
this.deprecated = deprecated;
}

public FsP01012W01012B getFsP01012W01012B() {
return fsP01012W01012B;
}

public void setFsP01012W01012B(FsP01012W01012B fsP01012W01012B) {
this.fsP01012W01012B = fsP01012W01012B;
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

public Boolean getDeprecated() {
return deprecated;
}

public void setDeprecated(Boolean deprecated) {
this.deprecated = deprecated;
}

}