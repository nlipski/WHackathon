package com.example.nlipski.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open activity for button 1
        Button advanceToButton = (Button) findViewById(R.id.button1);
        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

        // Open activity for button 2
        advanceToButton = (Button) findViewById(R.id.button2);
        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

        // Open activity for button 3
        advanceToButton = (Button) findViewById(R.id.button3);

        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

        // Open activity for button 4
        advanceToButton = (Button) findViewById(R.id.button4);
        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

        // Open activity for button 5
        advanceToButton = (Button) findViewById(R.id.button5);
        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

        // Open activity for button 6
        advanceToButton = (Button) findViewById(R.id.button6);
        advanceToButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, plant_activity.class);
                startActivity(c);
            }

        });

    }

}