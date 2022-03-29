package com.example.meta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView textView;
    TextView textView2;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        progressBar = findViewById(R.id.pb);
        textView = findViewById(R.id.category_txt);
        textView2 = findViewById(R.id.code_txt);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.mfapi.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiEnterface apiEnterface = retrofit.create(ApiEnterface.class);
        Call<MetaList> call = apiEnterface.getMeta();

        call.enqueue(new Callback<MetaList>() {
            @Override
            public void onResponse(Call<MetaList> call, Response<MetaList> response) {
                Adapter adapter = new Adapter(MainActivity.this,
                        response.body().data);

                textView.setText(response.body().meta.getScheme_category());
                textView2.setText(response.body().meta.getScheme_code());
                recyclerView.setAdapter(adapter);

                progressBar.setVisibility(View.GONE);


            }

            @Override
            public void onFailure(Call<MetaList> call, Throwable t) {
                progressBar.setVisibility(View.GONE);

                Toast.makeText(getApplicationContext(), "erro", Toast.LENGTH_LONG).show();

            }
        });


    }
}