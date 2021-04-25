package com.pocketasl.myapplication.ui.home.level11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.pocketasl.myapplication.R;
import com.pocketasl.myapplication.ui.home.level11.alphabet.alphabet;
import com.pocketasl.myapplication.ui.home.level11.alphabet.alphabet2;

public class Level12Activity extends AppCompatActivity {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.level12);

        button = (Button) findViewById(R.id.level12go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                openh();
            }
        });

        ImageButton level12back = (ImageButton) findViewById(R.id.level12back);
        level12back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method
                finish();
            }
        });
    }
    public void openh(){
        Intent intent = new Intent(this, alphabet2.class);
        startActivity(intent);
    }


}