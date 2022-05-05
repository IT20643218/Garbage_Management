package com.example.garbage_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    EditText name,password;
    Button login,homeregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name = findViewById(R.id.homename);
        password = findViewById(R.id.homepassword);
        login = findViewById(R.id.homelogin);
        homeregister= findViewById(R.id.homeregister);

        homeregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Work_Reports.class);
                startActivity(i);
            }
        });

        /*register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Work_Reports.class);
                startActivity(a);
            }
        });*/
    }
}