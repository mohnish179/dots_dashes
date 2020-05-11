package com.example.c;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class no_players extends AppCompatActivity {
    int a;
   // public static final String Numb_color="com.example.factorise.Numb_color";
    private static final String TAG = "no_players";
    int q;
    Intent intent1;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.no_players);
        Button d= findViewById(R.id.m1);
        d.setTextSize(30);
         Button b= findViewById(R.id.m2);
        b.setTextSize(30);
        Button c= findViewById(R.id.m3);
        c.setTextSize(30);
        TextView t1= findViewById(R.id.t1);
        t1.setTextColor(Color.BLUE);
        a=getIntent().getIntExtra(MainActivity.Numb_grid,0);
        Log.d(TAG, "onCreate: what!"+a);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              q=2;
              startIntent();

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            q=3;
                startIntent();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            q=4;
                startIntent();
            }
        });

    }//0n
    public void startIntent()
    {
        if(a==1)
        {
            intent1=new Intent(no_players.this,screen4by4.class);
        }
        else if(a==2)
        {
            intent1=new Intent(no_players.this,screen5by5.class);
        }
        else
        {
          intent1=new Intent(no_players.this,screen6by6.class);
        }
        intent1.putExtra("Numb_color",q);
        Log.d(TAG, "startIntent: what!!"+q);
        startActivity(intent1);
    }
}//apa
