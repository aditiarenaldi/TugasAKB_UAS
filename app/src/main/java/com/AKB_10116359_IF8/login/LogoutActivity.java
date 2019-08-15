package com.AKB_10116359_IF8.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.AKB_10116359_IF8.R;
import com.AKB_10116359_IF8.presenter.SplashActivity;

// NIM      : 10116359
// Nama     : Aditia Renaldi
// Kelas    : IF - 8
// Tanggal Pengerjaan : 14 Agustus 2019

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new Intent(getBaseContext(), SplashActivity.class));
                finish();
            }
        });

    }
}
