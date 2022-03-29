package com.example.meta;

import android.media.MediaDrm;

import com.google.gson.annotations.SerializedName;

public class DataModelClass {
    @SerializedName("date")
private String date;
    @SerializedName("nav")
    private String nav;

    public DataModelClass(String date, String nav) {
        this.date = date;
        this.nav = nav;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNav() {
        return nav;
    }

    public void setNav(String nav) {
        this.nav = nav;
    }
}
