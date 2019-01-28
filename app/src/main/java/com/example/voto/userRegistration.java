package com.example.voto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
public class userRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
    }

    public void loadLogin(View view){
        Intent loadLogin = new Intent(this, MainActivity.class);
        startActivity(loadLogin);
    }
}
