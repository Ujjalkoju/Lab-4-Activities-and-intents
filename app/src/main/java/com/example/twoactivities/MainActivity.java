package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_SayHello;
    private Button btn_count;
    private TextView counter;
    private int count=0;
    private String message="Hello!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_SayHello=findViewById(R.id.btnhello);
        btn_count=findViewById(R.id.btncount);
        counter=findViewById(R.id.txtview);
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                counter.setText(""+count);
            }
        });
        btn_SayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = Activity_Second.makeIntent(MainActivity.this,count,message );

                startActivity(intent);
            }
        });
    }

}
