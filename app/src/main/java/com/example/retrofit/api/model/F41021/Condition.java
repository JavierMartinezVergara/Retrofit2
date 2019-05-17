package com.example.retrofit.api.model.F41021;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Condition {

    @SerializedName("value")
    @Expose
    private List<Value> value = null;
    @SerializedName("controlId")
    @Expose
    private String controlId;
    @SerializedName("operator")
    @Expose
    private String operator;

    /**
     * No args constructor for use in serialization
     *
     */
    public Condition() {
    }

    /**
     *
     * @param value
     * @param controlId
     * @param operator
     */
    public Condition(List<Value> value, String controlId, String operator) {
        super();
        this.value = value;
        this.controlId = controlId;
        this.operator = operator;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }

    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}