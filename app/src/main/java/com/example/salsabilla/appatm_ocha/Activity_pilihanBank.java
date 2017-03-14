package com.example.salsabilla.appatm_ocha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Activity_pilihanBank extends AppCompatActivity {
    Button btnceksaldo, btntarik, btnsetor, btntransfer, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_pilihan_bank);

        btnceksaldo = (Button) findViewById(R.id.btnceksaldo);
        btnsetor = (Button) findViewById(R.id.btnsetor);
        btntarik = (Button) findViewById(R.id.btntarik);
        btntransfer = (Button) findViewById(R.id.btntransfer);
        btnexit = (Button) findViewById(R.id.btnexit);

        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_pilihanBank.this, CekSaldo.class);
                startActivity(i);
            }
        });
        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_pilihanBank.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_pilihanBank.this, penyetoran.class);
                startActivity(i);
            }
        });
        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_pilihanBank.this, Transfer.class);
                startActivity(i);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();

            }
        });
    }
}
