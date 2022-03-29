package com.example.meta;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetaList {
    @SerializedName("data")
    List<DataModelClass> data;

    @SerializedName("meta")
  MetaModel meta;
}
