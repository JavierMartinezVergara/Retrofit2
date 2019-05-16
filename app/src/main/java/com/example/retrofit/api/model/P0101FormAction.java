package com.example.retrofit.api.model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class P0101FormAction {

    @SerializedName("command")
    @Expose
    private String command;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("controlID")
    @Expose
    private String controlID;

    /**
     * No args constructor for use in serialization
     *
     */
    public P0101FormAction() {
    }

    /**
     *
     * @param value
     * @param command
     * @param controlID
     */
    public P0101FormAction(String command, String value, String controlID) {
        super();
        this.command = command;
        this.value = value;
        this.controlID = controlID;
    }

    public P0101FormAction(String command,  String controlID) {
        super();
        this.command = command;

        this.controlID = controlID;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getControlID() {
        return controlID;
    }

    public void setControlID(String controlID) {
        this.controlID = controlID;
    }
}
