package com.example.retrofit.api.responses.DataBrowseF41021;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FsDATABROWSEF41021 {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public FsDATABROWSEF41021() {
    }

    /**
     *
     * @param title
     * @param errors
     * @param data
     * @param warnings
     */
    public FsDATABROWSEF41021(String title, Data data, List<Object> errors, List<Object> warnings) {
        super();
        this.title = title;
        this.data = data;
        this.errors = errors;
        this.warnings = warnings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

}