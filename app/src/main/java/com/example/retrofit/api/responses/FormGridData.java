package com.example.retrofit.api.responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FormGridData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("rowset")
    @Expose
    private List<Rowset> rowset = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public FormGridData() {
    }


   /* public GridData(Integer id, Titles titles, List<Rowset> rowset, Summary summary) {
        super();
        this.id = id;
        this.titles = titles;
        this.rowset = rowset;
        this.summary = summary;
    }

    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<Rowset> getRowset() {
        return rowset;
    }

    public void setRowset(List<Rowset> rowset) {
        this.rowset = rowset;
    }


}
