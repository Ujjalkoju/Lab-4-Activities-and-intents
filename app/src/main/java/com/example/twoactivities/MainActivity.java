package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button paragraph1;
    private Button paragraph2;
    private Button paragraph3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paragraph1=findViewById(R.id.btn_first);
        paragraph2=findViewById(R.id.btn_second);
        paragraph3=findViewById(R.id.btn_third);

        paragraph1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title);
                String article = getResources().getString(R.string.article_MoMo);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );

                startActivity(intent);
            }
        });

        paragraph2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title1);
                String article = getResources().getString(R.string.article_Chowmein);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );
                startActivity(intent);
            }
        });
        paragraph3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String header = getResources().getString(R.string.article_title2);
                String article = getResources().getString(R.string.article_Pizza);
                Intent intent = SecondActivity.makeIntent(MainActivity.this,header,article );
                startActivity(intent);
            }
        });
    }
}