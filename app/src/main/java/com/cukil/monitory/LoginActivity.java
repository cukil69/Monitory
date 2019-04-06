package com.cukil.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/*

    NIM          : 10116900
    Nama         : Syauqi Ilham Alfaraci
    Kelas        : IF-14K
    Tanggal buat : 06-04-2019

 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToBiodata(View view) {
        Intent i = new Intent(LoginActivity.this, BiodataActivity.class);
        startActivity(i);
    }
}
