package com.example.c;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import viewsa.CustomView;


public class screen5by5 extends AppCompatActivity implements View.OnClickListener {
    CustomView mc;
    int e,f,g;
    int h;
    int[] c=new int[4];
    int temp;
    int temp3=0;
    AlertDialog.Builder pop_up;
    private static final String TAG = "screen5by5";
    int[] x= new int[40];
    int[] y=new int [16];
    int block_redo,block_redo2;
    Vibrator z;
    Button[] v = new Button[41];
    int temp1=0,temp2=-1;
    TextView t1;
    int t1_color;
    int t,p;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);
        mc = findViewById(R.id.c2);
        t1= findViewById(R.id.p2);
        mc.draw_dots(1);
        t2= findViewById(R.id.s2);
        p=getIntent().getIntExtra("Numb_color",2);
        mc.get_players(p);
        Log.d(TAG, "onCreate: what"+p);
        for(int i=0;i<41;i++)
        {
            String b="button"+(i+1);
            v[i]= findViewById(getResources().getIdentifier(b,"id",getPackageName()));
            v[i].setOnClickListener(this);
            v[i].setBackgroundColor(Color.TRANSPARENT);

        }//for
        v[40].setBackgroundColor(Color.BLUE);
        v[40].setTextColor(Color.BLACK);

    }//on_create
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if(block_redo==2)
        {
            block_redo=0;
        }
        if(block_redo==1)
        {
            block_redo=2;
        }
        t1_color=mc.get_color(0);

        pop_up= new AlertDialog.Builder(this);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.pen_write);
        MediaPlayer mp2=MediaPlayer.create(this,R.raw.ting);
        final MediaPlayer mp4=MediaPlayer.create(this,R.raw.tada);
        final MediaPlayer mp5=MediaPlayer.create(this,R.raw.cheer);
        MediaPlayer mp3=MediaPlayer.create(this,R.raw.paper);
        z = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        switch (v.getId()) {
            case R.id.button1:
                v.setEnabled(false);
                mc.draw_line(0, 0,1);
                x[0]=1;
                mp.start();
                break;
            case R.id.button2:
                v.setEnabled(false);

                mc.draw_line(0, 1,1);
                x[1]=1;
                mp.start();break;
            case R.id.button3:
                v.setEnabled(false);

                mc.draw_line(0, 2,1);
                x[2]=1;

                mp.start();break;
            case R.id.button4:
                v.setEnabled(false);

                mc.draw_line(0, 3,1);
                x[3]=1;
                mp.start();break;
            case R.id.button5:
                v.setEnabled(false);

                mc.draw_line(1, 0,1);
                x[4]=1;
                mp.start();break;
            case R.id.button6:
                v.setEnabled(false);

                mc.draw_line(1, 1,1);
                x[5]=1;
                mp.start();break;
            case R.id.button7:
                v.setEnabled(false);

                mc.draw_line(1, 2,1);
                x[6]=1;
                mp.start();break;
            case R.id.button8:
                v.setEnabled(false);

                mc.draw_line(1, 3,1);
                x[7]=1;
                mp.start();break;
            case R.id.button9:
                v.setEnabled(false);

                mc.draw_line(2, 0,1);
                x[8]=1;
                mp.start();break;
            case R.id.button10:
                v.setEnabled(false);

                mc.draw_line(2, 1,1);
                x[9]=1;
                mp.start();break;
            case R.id.button11:
                v.setEnabled(false);

                mc.draw_line(2, 2,1);
                x[10]=1;
                mp.start();break;
            case R.id.button12:
                v.setEnabled(false);

                mc.draw_line(2, 3,1);
                x[11]=1;
                mp.start();break;
            case R.id.button13:
                v.setEnabled(false);

                mc.draw_line(3, 0,1);x[12]=1;
                mp.start();break;
            case R.id.button14:
                v.setEnabled(false);

                mc.draw_line(3, 1,1);x[13]=1;
                mp.start();break;
            case R.id.button15:
                v.setEnabled(false);

                mc.draw_line(3, 2,1);x[14]=1;
                mp.start();break;
            case R.id.button16:
                v.setEnabled(false);

                mc.draw_line(3, 3,1);x[15]=1;
                mp.start();break;
            case R.id.button17:
                v.setEnabled(false);

                mc.draw_line(4, 0,1);x[16]=1;
                mp.start();break;
            case R.id.button18:
                v.setEnabled(false);
                mc.draw_line(4, 1,1);
                x[17]=1;
                mp.start();break;
            case R.id.button19:
                v.setEnabled(false);

                mc.draw_line(4, 2,1);x[18]=1;
                mp.start();break;
            case R.id.button20:
                v.setEnabled(false);

                mc.draw_line(4, 3,1);x[19]=1;
                mp.start();break;
            case R.id.button21:
                v.setEnabled(false);

                mc.draw_v_line(0, 0,1);x[20]=1;
                mp.start();break;
            case R.id.button22:
                v.setEnabled(false);

                mc.draw_v_line(0, 1,1);x[21]=1;
                mp.start();break;
            case R.id.button23:
                v.setEnabled(false);

                mc.draw_v_line(0, 2,1);x[22]=1;
                mp.start();break;
            case R.id.button24:
                v.setEnabled(false);

                mc.draw_v_line(0, 3,1);x[23]=1;
                mp.start();break;
            case R.id.button25:
                v.setEnabled(false);
                mc.draw_v_line(0, 4,1);
                x[24]=1;
                mp.start();break;
            case R.id.button26:
                v.setEnabled(false);

                mc.draw_v_line(1, 0,1);
                x[25]=1;
                mp.start();break;
            case R.id.button27:
                v.setEnabled(false);

                mc.draw_v_line(1, 1,1);
                x[26]=1;

                mp.start();break;
            case R.id.button28:
                v.setEnabled(false);

                mc.draw_v_line(1, 2,1);
                x[27]=1;
                mp.start();break;
            case R.id.button29:
                v.setEnabled(false);

                mc.draw_v_line(1, 3,1);
                x[28]=1;
                mp.start();break;
            case R.id.button30:
                v.setEnabled(false);

                mc.draw_v_line(1, 4,1);
                x[29]=1;
                mp.start();break;
            case R.id.button31:
                v.setEnabled(false);

                mc.draw_v_line(2, 0,1);
                x[30]=1;
                mp.start();break;
            case R.id.button32:
                v.setEnabled(false);

                mc.draw_v_line(2, 1,1);
                x[31]=1;
                mp.start();break;
            case R.id.button33:
                v.setEnabled(false);
                mc.draw_v_line(2, 2,1);
                x[32]=1;
                mp.start();break;
            case R.id.button34:
                v.setEnabled(false);

                mc.draw_v_line(2, 3,1);
                x[33]=1;
                mp.start();break;
            case R.id.button35:
                v.setEnabled(false);

                mc.draw_v_line(2, 4,1);
                x[34]=1;

                mp.start();break;
            case R.id.button36:
                v.setEnabled(false);

                mc.draw_v_line(3, 0,1);
                x[35]=1;
                mp.start();break;
            case R.id.button37:
                v.setEnabled(false);
                mc.draw_v_line(3,1,1);
                x[36]=1;
                mp.start();break;
            case R.id.button38:
                v.setEnabled(false);
                mc.draw_v_line(3, 2,1);
                x[37]=1;
                mp.start();break;
            case R.id.button39:
                v.setEnabled(false);

                mc.draw_v_line(3, 3,1);
                x[38]=1;
                mp.start();break;
            case R.id.button40:
                v.setEnabled(false);

                mc.draw_v_line(3, 4,1);
                x[39]=1;
                mp.start();break;
            case R.id.button41:
                if(block_redo==0)
                {f=mc.undo();
                mp3.start();
                    undo_change();
                    block_redo2+=1;
                    block_redo++;}
                else
                    Toast.makeText(screen5by5.this, "Can't undo twice ", Toast.LENGTH_SHORT).show();
                break;




        }//switch case
        if(e==1)
        {
            bgcolor();
        }
        e++;




        for (int j = 0; j < 16; j++) {
            if (j / 4== 0)
                t = 20;
            else if (j / 4 == 1)
                t = 21;
            else if(j/4==2)
                t = 22;
            else
                t=23;

            if (x[j] == 1) {
                if (x[j + 4] == 1) {

                    if (x[t + j] == 1) {

                        if (x[t + 1 + j] == 1) {
                            if (y[j] == 0) {
                                y[j] = 1;
                                temp1+=1;
                                if(temp2==-1)
                                    temp2=j;
                                if(temp1==2)
                                {
                                    mc.e_draw_box(j,temp2);
                                    mp2.start();
                                    temp3=2;
                                    z.vibrate(400);
                                }
                                else {
                                    mc.draw_box(j);
                                    mp2.start();
                                    t1_color=mc.get_color(1);
                                    temp3=1;
                                    z.vibrate(400);
                                }
                            }

                        }
                    }
                }
            }

        }//for
        temp1=0;
        temp2=-1;


if(block_redo2==0) {
    if (t1_color == 1) {
        t1.setTextColor(Color.RED);
        t1.setText("Red Plays");
    } else if (t1_color == 2) {
        t1.setTextColor(Color.GREEN);
        t1.setText("Green Plays");
    } else if (t1_color == 3) {
        t1.setTextColor(Color.BLUE);
        t1.setText("Blue Plays");
    } else if (t1_color == 4) {
        t1.setTextColor(Color.YELLOW);
        t1.setText("Yellow ->");
    }
    if (temp3 == 1) {
        if (t1_color == 1) {
            c[0]++;
        } else if (t1_color == 2) {
            c[1]++;

        } else if (t1_color == 3) {
            c[2]++;
        } else if (t1_color == 4) {
            c[3]++;
        }

    }
    if (temp3 == 2) {
        if (t1_color == 1) {
            c[0] += 2;
        } else if (t1_color == 2) {
            c[1] += 2;

        } else if (t1_color == 3) {
            c[2] += 2;
        } else if (t1_color == 4) {
            c[3] += 2;
        }
    }
}
block_redo2=0;
temp3=0;

    if(p==4)
        t2.setText("red :"+c[0]+"\ngreen :"+c[1]+"\nblue :"+c[2]+"\nyellow :"+c[3]);
    else if(p==3)
    {
        t2.setText("red :"+c[0]+"\ngreen :"+c[1]+"\nblue :"+c[2]);
    }
    else if(p==2)
    {
        t2.setText("red :"+c[0]+"\ngreen :"+c[1]);
    }



        g=0;
        for(int i=0;i<16;i++)
        {
            if(y[i]==1)
            {
                g++;
            }
            Log.d(TAG, "onClick: g case"+g);

        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(g==16)
                { mp5.start();
                mp4.start();
                    c=mc.get_score();
                    h=hs(c[0],c[1],c[2],c[3]);
                    if(h==0)
                    {
                        pop_up.setTitle("There is a draw ");
                    }

                   else if(h==c[0])
                    {
                        pop_up.setTitle("The winner is Red with score "+h);
                    }
                    else if(h==c[1])
                    {
                        pop_up.setTitle("The winner is Green with score "+h);
                    }
                    else if(h==c[2])
                    {
                        pop_up.setTitle("The winner is Blue with score "+h);
                    }
                    else if(h==c[3])
                    {
                        pop_up.setTitle("The winner is Yellow with score "+h);
                    }




                    if(p==2)
                        pop_up.setMessage("The scores are : \n" + "red:"+c[0]+"\ngreen:"+c[1]);
                    if(p==3)
                        pop_up.setMessage("The scores are : \n" + "red:"+c[0]+"\ngreen:"+c[1]+"\n blue:"+c[2]);
                    if(p==4)
                    {
                        pop_up.setMessage("The scores are : \n" + "red:"+c[0]+"\ngreen:"+c[1]+"\n blue:"+c[2]+"\n yellow:"+c[3]);
                    }




                    pop_up.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent abc = new Intent(screen5by5.this, MainActivity.class);
                            startActivity(abc);

                        }
                    });
                    pop_up.show();
                }

            }
        },1000);
    }//on_click
    public void undo_change()
    {

        if(f!=-1)
        { v[f].setEnabled(true);
            Log.d(TAG, "undo_change: "+f);
        x[f]=0;
        }
        else
        {
            Toast.makeText(screen5by5.this, "That's Cheating ,You can't undo a box... ", Toast.LENGTH_LONG).show();
        }


        e=0;
    }
    public void bgcolor()
    {
        v[40].setBackgroundColor(Color.BLUE);
    }
    public int hs(int a1,int a2,int a3,int a4)
    {
        int[] a=new int[4];
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        a[3]=a4;
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        Log.d(TAG, "hs: "+a[3]);
        if(a[3]==a[2])
            return 0;
        else
            return a[3];
    }

}//apa


