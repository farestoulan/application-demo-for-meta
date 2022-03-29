package com.example.meta;

import com.google.gson.annotations.SerializedName;

public class MetaModel {
    @SerializedName("scheme_category")
    private String scheme_category;

    @SerializedName("scheme_code")
    private String scheme_code;

    public MetaModel(String scheme_category, String scheme_code) {
        this.scheme_category = scheme_category;
        this.scheme_code = scheme_code;
    }


    public String getScheme_category() {
        return scheme_category;
    }

    public void setScheme_category(String scheme_category) {
        this.scheme_category = scheme_category;
    }

    public String getScheme_code() {
        return scheme_code;
    }

    public void setScheme_code(String scheme_code) {
        this.scheme_code = scheme_code;
    }
}
