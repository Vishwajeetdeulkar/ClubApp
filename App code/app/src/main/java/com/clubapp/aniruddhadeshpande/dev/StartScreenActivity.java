package com.clubapp.aniruddhadeshpande.dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void openLogin(View view){
        Intent i = new Intent(StartScreenActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void openSignup(View view){
        Intent i = new Intent(StartScreenActivity.this, RegisterActivity.class);
        startActivity(i);
    }
}
