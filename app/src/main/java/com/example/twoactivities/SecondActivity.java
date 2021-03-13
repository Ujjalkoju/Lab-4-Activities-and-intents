package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView heading;
    private TextView article;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        heading=findViewById(R.id.article_heading);
        article=findViewById(R.id.article);
        Intent intent=getIntent();
        String head=intent.getStringExtra("HEADER");
        String articl=intent.getStringExtra("ART");
        heading.setText(head);
        article.setText(articl);
    }
    public static Intent makeIntent(Context context, String header, String art){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("HEADER",header);
        intent.putExtra("ART",art);

        return intent;
    }
}