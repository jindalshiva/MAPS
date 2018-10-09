package com.drozee.drozeebvest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter{
    private Context mContext;
    private ArrayList<String> preferences;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView pref;
        TextView author;

        public MyViewHolder(View view) {
            super(view);
            pref = (TextView) view.findViewById(R.id.prefTV);
            author = (TextView)view.findViewById(R.id.authorET);
        }
    }
    public RecyclerViewAdapter(Context c, ArrayList<String> prefs) {
        mContext = c;
        preferences = prefs;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        TextView tv = holder.itemView.findViewById(R.id.prefTV);
        TextView auth = holder.itemView.findViewById(R.id.authorET);
        tv.setText(preferences.get(position).split(",")[0]);
        auth.setText(preferences.get(position).split(",")[1]);
    }

    @Override
    public int getItemCount() {
        return preferences.size();
    }
}
