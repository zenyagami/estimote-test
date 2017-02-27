package com.zenkun.beaconcode;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.zenkun.beaconcode.adapter.AdapterCoffee;
import com.zenkun.beaconcode.util.Utils;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.content_coffe_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //mRecyclerView.getLayoutManager().setAutoMeasureEnabled(true);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        AdapterCoffee adapterCoffee = new AdapterCoffee(Utils.getRandomCoffeData());
        mRecyclerView.setAdapter(adapterCoffee);

    }
}
