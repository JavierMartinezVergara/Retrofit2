package com.example.retrofit.api.model.F41021;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("autoFind")
    @Expose
    private Boolean autoFind;
    @SerializedName("condition")
    @Expose
    private List<Condition> condition = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Query() {
    }

    /**
     *
     * @param condition
     * @param autoFind
     */
    public Query(Boolean autoFind, List<Condition> condition) {
        super();
        this.autoFind = autoFind;
        this.condition = condition;
    }

    public Boolean getAutoFind() {
        return autoFind;
    }

    public void setAutoFind(Boolean autoFind) {
        this.autoFind = autoFind;
    }

    public List<Condition> getCondition() {
        return condition;
    }

    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

}