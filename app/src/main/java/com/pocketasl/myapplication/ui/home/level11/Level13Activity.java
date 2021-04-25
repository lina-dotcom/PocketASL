package com.pocketasl.myapplication.ui.home.level11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.pocketasl.myapplication.R;
import com.pocketasl.myapplication.ui.home.level11.alphabet.alphabet2;
import com.pocketasl.myapplication.ui.home.level11.alphabet.alphabet3;

public class Level13Activity extends AppCompatActivity {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.level13);

        button = (Button) findViewById(R.id.level13go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                openq();
            }
        });

        ImageButton level13back = (ImageButton) findViewById(R.id.level13back);
        level13back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
    public void openq(){
        Intent intent = new Intent(this, alphabet3.class);
        startActivity(intent);
    }


}