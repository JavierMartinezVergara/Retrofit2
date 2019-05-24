package com.example.retrofit.api.responses.DataBrowseF41021;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Columns {

    @SerializedName("F41021_ITM")
    @Expose
    private String f41021ITM;
    @SerializedName("F41021_MCU")
    @Expose
    private String f41021MCU;
    @SerializedName("F41021_LOCN")
    @Expose
    private String f41021LOCN;
    @SerializedName("F41021_LOTN")
    @Expose
    private String f41021LOTN;

    /**
     * No args constructor for use in serialization
     *
     */
    public Columns() {
    }

    /**
     *
     * @param f41021ITM
     * @param f41021LOTN
     * @param f41021MCU
     * @param f41021LOCN
     */
    public Columns(String f41021ITM, String f41021MCU, String f41021LOCN, String f41021LOTN) {
        super();
        this.f41021ITM = f41021ITM;
        this.f41021MCU = f41021MCU;
        this.f41021LOCN = f41021LOCN;
        this.f41021LOTN = f41021LOTN;
    }

    public String getF41021ITM() {
        return f41021ITM;
    }

    public void setF41021ITM(String f41021ITM) {
        this.f41021ITM = f41021ITM;
    }

    public String getF41021MCU() {
        return f41021MCU;
    }

    public void setF41021MCU(String f41021MCU) {
        this.f41021MCU = f41021MCU;
    }

    public String getF41021LOCN() {
        return f41021LOCN;
    }

    public void setF41021LOCN(String f41021LOCN) {
        this.f41021LOCN = f41021LOCN;
    }

    public String getF41021LOTN() {
        return f41021LOTN;
    }

    public void setF41021LOTN(String f41021LOTN) {
        this.f41021LOTN = f41021LOTN;
    }

}