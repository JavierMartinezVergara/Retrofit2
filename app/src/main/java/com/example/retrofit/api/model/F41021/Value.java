package com.example.retrofit.api.model.F41021;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("specialValueId")
    @Expose
    private String specialValueId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Value() {
    }

    /**
     *
     * @param content
     * @param specialValueId
     */
    public Value(String content, String specialValueId) {
        super();
        this.content = content;
        this.specialValueId = specialValueId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSpecialValueId() {
        return specialValueId;
    }

    public void setSpecialValueId(String specialValueId) {
        this.specialValueId = specialValueId;
    }

}