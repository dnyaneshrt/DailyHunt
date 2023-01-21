package com.itp.dailyhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        Handler handler=new Handler();
  /*      handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },7000);*/

        //using lamda expression
        handler.postDelayed(()->{
                    Intent intent=new Intent(this,CategoryActivity.class);
                    startActivity(intent);
            }
        ,7000);

    }
}