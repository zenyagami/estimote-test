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
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.content_coffe_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //mRecyclerView.getLayoutManager().setAutoMeasureEnabled(true);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        AdapterCoffee adapterCoffee = new AdapterCoffee(Utils.getRandomCoffeData());
        mRecyclerView.setAdapter(adapterCoffee);

    }
}
