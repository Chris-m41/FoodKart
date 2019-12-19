package com.example.foodkart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LogIn.class));
    }

    public void continueWithoutLogin(View view) {
        startActivity(new Intent(this, Categories.class));

    }


}



