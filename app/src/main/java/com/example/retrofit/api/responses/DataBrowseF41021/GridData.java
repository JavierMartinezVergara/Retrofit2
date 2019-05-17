
package com.example.retrofit.api.responses.DataBrowseF41021;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class GridData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("fullGridId")
    @Expose
    private String fullGridId;
    @SerializedName("columns")
    @Expose
    private Columns columns;
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
     * @param fullGridId
     * @param rowset
     * @param columns
     */
    public GridData(Integer id, String fullGridId, Columns columns, List<Rowset> rowset, Summary summary) {
        super();
        this.id = id;
        this.fullGridId = fullGridId;
        this.columns = columns;
        this.rowset = rowset;
        this.summary = summary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullGridId() {
        return fullGridId;
    }

    public void setFullGridId(String fullGridId) {
        this.fullGridId = fullGridId;
    }

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
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