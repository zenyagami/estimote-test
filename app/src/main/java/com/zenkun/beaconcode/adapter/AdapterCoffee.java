package com.zenkun.beaconcode.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zenkun.beaconcode.R;
import com.zenkun.beaconcode.model.ModelCoffee;

import java.util.List;

/**
 * Created by Zen zenyagami@gmail.com on 24/02/2017.
 */

public class AdapterCoffee extends RecyclerView.Adapter<AdapterCoffee.ViewHolder>  {
    private List<ModelCoffee> list;

    public AdapterCoffee(List<ModelCoffee> list) {
        this.list = list;
    }

    @Override
    public AdapterCoffee.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_row_coffe,parent,false));
    }

    @Override
    public void onBindViewHolder(AdapterCoffee.ViewHolder holder, int position) {
        ModelCoffee coffee =list.get(position);
        holder.mPhoto.setImageResource(coffee.resourcePhoto);
        holder.mTitle.setText(coffee.title);
        holder.mSubTitle.setText(coffee.subTitle);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public TextView mTitle;
        public TextView mSubTitle;
        public ImageView mPhoto;
        public ViewHolder(View v) {
            super(v);
            mTitle = (TextView)v.findViewById(R.id.adapter_coffee_title);
            mSubTitle = (TextView)v.findViewById(R.id.adapter_coffee_subtitle);
            mPhoto = (ImageView) v.findViewById(R.id.adapter_coffee_photo);
        }

    }
}
