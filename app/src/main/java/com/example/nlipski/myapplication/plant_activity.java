package com.example.nlipski.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.PopupWindow;

public class plant_activity extends AppCompatActivity {

    PopupWindow waterPopup, sunlightPopup, descriptionPopup, notificationPopup, accessoryPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_activity);

        // Replace action bar with toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPlantActivity);
        setSupportActionBar(toolbar);

        //toolbar.setNavigationIcon(R.drawable.back);

        waterPopup = new PopupWindow(findViewById(R.id.buttonWater).getContext());
        sunlightPopup = new PopupWindow(findViewById(R.id.buttonSunlight).getContext());
        descriptionPopup = new PopupWindow(findViewById(R.id.buttonDescription).getContext());
        notificationPopup = new PopupWindow(findViewById(R.id.buttonNotification).getContext());
        accessoryPopup = new PopupWindow(findViewById(R.id.buttonAccessory).getContext());
    }
}
