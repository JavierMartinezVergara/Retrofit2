package com.example.retrofit.api.responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GridData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("titles")
    @Expose
    private Titles titles;
    @SerializedName("rowset")
    @Expose
    private List<Rowset> rowset = null;
    @SerializedName("summary")
    @Expose
    private Summary summary;

    /**
     * No args constructor for use in serialization
     *
     */
    public GridData() {
    }

    /**
     *
     * @param summary
     * @param id
     * @param rowset
     * @param titles
     */
    public GridData(Integer id, Titles titles, List<Rowset> rowset, Summary summary) {
        super();
        this.id = id;
        this.titles = titles;
        this.rowset = rowset;
        this.summary = summary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public List<Rowset> getRowset() {
        return rowset;
    }

    public void setRowset(List<Rowset> rowset) {
        this.rowset = rowset;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

}
