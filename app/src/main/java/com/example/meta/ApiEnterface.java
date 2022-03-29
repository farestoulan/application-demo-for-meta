package com.example.meta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEnterface {
     @GET("/mf/107687")
public Call<MetaList>getMeta();
}
