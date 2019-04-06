package com.cukil.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/*

    NIM          : 10116900
    Nama         : Syauqi Ilham Alfaraci
    Kelas        : IF-14K
    Tanggal buat : 06-04-2019

 */

public class BiodataActivity extends AppCompatActivity {

    private EditText inNickname, inAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        inNickname = (EditText) findViewById(R.id.inNickName);
        inAge = (EditText) findViewById(R.id.inAge);
    }

    public void goToMain(View view) {
        Intent i = new Intent(BiodataActivity.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("nickname", inNickname.getText().toString().trim());
        i.putExtra("age", inAge.getText().toString().trim());
        startActivity(i);
    }
}
