package com.example.nlipski.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class plant_activity extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView im;
    PopupWindow popupWindow;
    LayoutInflater layoutInflater;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_activity);
        im=(ImageView)findViewById(R.id.ivPlant) ;
        b1=(Button)findViewById(R.id.btnWater);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.description_popup, null);
                popupWindow = new PopupWindow(container, 300, 300, true);
                popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY, 400, 400);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }

                });
            }
            });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.water_popup,null);
                popupWindow =new PopupWindow(container,300,300,true);
                popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY,400,400);
                container.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }

                });
            }
        });
        b2=(Button)findViewById(R.id.btnWater);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.sunlight_popup,null);
                popupWindow =new PopupWindow(container,300,300,true);
                popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY,400,400);
                container.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }

                });
            }
        });
    }
}
