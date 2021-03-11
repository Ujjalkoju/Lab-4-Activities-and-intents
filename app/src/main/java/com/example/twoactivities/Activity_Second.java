package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Second extends AppCompatActivity {
    private TextView counter;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__second);
        counter=findViewById(R.id.txtCount);
        msg=findViewById(R.id.txtHello);
        Intent intent=getIntent();
        String message=intent.getStringExtra("Message");
        int count=intent.getIntExtra("Count",0);
        msg.setText(message);
        counter.setText(""+count);




    }
    public static Intent makeIntent(Context context, int data, String msg){
        Intent intent=new Intent(context,Activity_Second.class);
        intent.putExtra("Count",data);
        intent.putExtra("Message",msg);

        return intent;
    }
}



