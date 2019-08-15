package com.AKB_10116359_IF8.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.AKB_10116359_IF8.R;
import com.AKB_10116359_IF8.login.LoginActivity;

// NIM      : 10116359
// Nama     : Aditia Renaldi
// Kelas    : IF - 8
// Tanggal Pengerjaan : 12 Agustus 2019

public class SplashActivity extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;
    private Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transisi);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);

        thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashActivity.this, viewpager.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        thread.start();
    }

}
