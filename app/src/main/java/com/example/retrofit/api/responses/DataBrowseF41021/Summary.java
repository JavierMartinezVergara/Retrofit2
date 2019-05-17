package com.example.retrofit.api.responses.DataBrowseF41021;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary {

    @SerializedName("records")
    @Expose
    private Integer records;
    @SerializedName("moreRecords")
    @Expose
    private Boolean moreRecords;

    /**
     * No args constructor for use in serialization
     *
     */
    public Summary() {
    }

    /**
     *
     * @param moreRecords
     * @param records
     */
    public Summary(Integer records, Boolean moreRecords) {
        super();
        this.records = records;
        this.moreRecords = moreRecords;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public Boolean getMoreRecords() {
        return moreRecords;
    }

    public void setMoreRecords(Boolean moreRecords) {
        this.moreRecords = moreRecords;
    }

}