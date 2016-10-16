package com.example.nlipski.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        b1 = (Button)findViewById(R.id.btnLogin);
        ed1=(EditText)findViewById(R.id.etEmail);
        ed2=(EditText)findViewById(R.id.etPassword);
        tv1=(TextView)findViewById(R.id.tvRegister);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&

                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login_Activity.this, plant_activity.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

