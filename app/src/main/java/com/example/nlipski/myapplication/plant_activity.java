package com.example.nlipski.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class plant_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_activity);

        // Replace action bar with toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.plant_toolbar);
        setSupportActionBar(toolbar);

        //toolbar.setNavigationIcon(R.drawable.back);
    }
}
