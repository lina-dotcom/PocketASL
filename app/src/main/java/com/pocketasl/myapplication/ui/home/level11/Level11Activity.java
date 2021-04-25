package com.pocketasl.myapplication.ui.home.level11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.pocketasl.myapplication.R;
import com.pocketasl.myapplication.ui.home.level11.alphabet.alphabet;

public class Level11Activity extends AppCompatActivity {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.level11);

        button = (Button) findViewById(R.id.level11go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                opena();
            }
        });

        ImageButton level11back = (ImageButton) findViewById(R.id.level11back);
        level11back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
    public void opena(){
        Intent intent = new Intent(this, alphabet.class);
        startActivity(intent);
    }








}