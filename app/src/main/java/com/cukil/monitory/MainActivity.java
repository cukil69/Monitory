package com.cukil.monitory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/*

    NIM          : 10116900
    Nama         : Syauqi Ilham Alfaraci
    Kelas        : IF-14K
    Tanggal buat : 06-04-2019

 */

public class MainActivity extends AppCompatActivity {

    private TextView tSayHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b = getIntent().getExtras();
        if (b != null && b.containsKey("nickname")) {
            tSayHi = (TextView) findViewById(R.id.tSayHi);
            tSayHi.setText("Beres! Sekarang " + b.getString("nickname") + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
        } else
            finish();
    }

    public void exit(View view) {
        finish();
    }
}
