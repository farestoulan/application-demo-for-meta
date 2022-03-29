package com.example.meta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private final Context mContext;
private final List<DataModelClass> mData;
    public Adapter(Context mContext, List<DataModelClass > mData) {
        this.mContext = mContext;
        this.mData = mData;


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        v = inflater.inflate(R.layout.meta_item , parent , false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

      holder.date_txt.setText(mData.get(position).getDate());
      holder.nav_txt.setText(mData.get(position).getNav());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

TextView date_txt;
TextView nav_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            date_txt = itemView.findViewById(R.id.date_txt);
            nav_txt = itemView.findViewById(R.id.nav_txt);
        }
    }
}
