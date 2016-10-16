package com.example.nlipski.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {
    CheckBox rb1;
    Button b1;
    EditText et1,et2,et3,et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        rb1=(CheckBox)findViewById(R.id.cbTerms);
        b1=(Button)findViewById(R.id.btnRegister);
        et1=(EditText)findViewById(R.id.etName);
        et2=(EditText)findViewById(R.id.etEmail);
        et3=(EditText)findViewById(R.id.etPass);
        et4=(EditText)findViewById(R.id.etConf);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().length()>0 &&
                        et2.getText().toString().length()>0&& et3.getText().toString().equals(et4.getText().toString()) && rb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Creating an account...",Toast.LENGTH_SHORT).show();
                    UserProfile temp = new UserProfile(et1.getText().toString(),et2.getText().toString(),et3.getText().toString());
                    Intent i = new Intent(Register_Activity.this, Login_Activity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "Account has been created...",Toast.LENGTH_SHORT).show();

                }
                else
                    Toast.makeText(getApplicationContext(), "Try again",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
