package com.example.rismajt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TambahPendidikan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_pendidikan);
    }
    public void btnTambah(View view) {
        Intent i = new Intent(TambahPendidikan.this, home_page.class);
        startActivity(i);
    }
}