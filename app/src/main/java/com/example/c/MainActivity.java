package com.example.c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int q;
    public static final String Numb_grid = "com.example.factorise.Numb_grid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a= findViewById(R.id.b1);
        a.setTextSize(30);
        Button b= findViewById(R.id.b2);
        b.setTextSize(30);
        Button c= findViewById(R.id.b3);
        c.setTextSize(30);
        TextView t1= findViewById(R.id.t1);
        t1.setTextColor(Color.BLUE);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,no_players.class);
                q=1;
                intent1.putExtra(Numb_grid,q);
                startActivity(intent1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,no_players.class);
                q=2;
                intent2.putExtra(Numb_grid,q);
                startActivity(intent2);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent (MainActivity.this,no_players.class);
                q=3;
                intent3.putExtra(Numb_grid,q);
                startActivity(intent3);
            }
        });



    }//oc





}//apa