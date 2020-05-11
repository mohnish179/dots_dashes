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
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import viewsa.CustomView;

public class screen6by6 extends AppCompatActivity implements View.OnClickListener {
    int e,f,h,g;
    int temp;
    Vibrator z;
    TextView t2;
    int block_redo,block_redo2;
    int[] c=new int[4];
    TextView t1;
    AlertDialog.Builder pop_up;
    CustomView mc;
    int[] x= new int[60];
    int[] y=new int [25];
    int t,p;
    int t1_color;
    Button[] v = new Button[61];
    int temp1=0,temp2=-1;
    int temp3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);
        mc =  findViewById(R.id.c3);
        t1= findViewById(R.id.p3);
        mc.draw_dots(2);
        t2= findViewById(R.id.s3);
        p=getIntent().getIntExtra("Numb_color",2);
        mc.get_players(p);


        for(int i=0;i<61;i++)
        {
            String b="button"+(i+1);
            v[i]=findViewById(getResources().getIdentifier(b,"id",getPackageName()));
            v[i].setOnClickListener(this);
            v[i].setBackgroundColor(Color.TRANSPARENT);

        }//for
        v[60].setBackgroundColor(Color.BLUE);
        v[60].setTextColor(Color.BLACK);
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
        MediaPlayer mp = MediaPlayer.create(this, R.raw.pen_write);
        MediaPlayer mp2=MediaPlayer.create(this,R.raw.ting);
        MediaPlayer mp3=MediaPlayer.create(this,R.raw.paper);
        final MediaPlayer mp4=MediaPlayer.create(this,R.raw.tada);
        final MediaPlayer mp5=MediaPlayer.create(this,R.raw.cheer);
        z = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        pop_up= new AlertDialog.Builder(this);
        switch (v.getId()) {
            case R.id.button1:
                v.setEnabled(false);
                mc.draw_line(0, 0,2);
                x[0]=1;
                mp.start();break;
            case R.id.button2:
                v.setEnabled(false);

                mc.draw_line(0, 1,2);
                x[1]=1;
                mp.start();break;
            case R.id.button3:
                v.setEnabled(false);

                mc.draw_line(0, 2,2);
                x[2]=1;

                mp.start();break;
            case R.id.button4:
                v.setEnabled(false);

                mc.draw_line(0, 3,2);
                x[3]=1;
                mp.start();break;
            case R.id.button5:
                v.setEnabled(false);

                mc.draw_line(0, 4,2);
                x[4]=1;
                mp.start();break;
            case R.id.button6:
                v.setEnabled(false);

                mc.draw_line(1, 0,2);
                x[5]=1;
                mp.start();break;
            case R.id.button7:
                v.setEnabled(false);

                mc.draw_line(1, 1,2);
                x[6]=1;
                mp.start();break;
            case R.id.button8:
                v.setEnabled(false);

                mc.draw_line(1, 2,2);
                x[7]=1;
                mp.start();break;
            case R.id.button9:
                v.setEnabled(false);
                mc.draw_line(1, 3,2);
                x[8]=1;
                mp.start();break;
            case R.id.button10:
                v.setEnabled(false);

                mc.draw_line(1, 4,2);
                x[9]=1;
                mp.start();break;
            case R.id.button11:
                v.setEnabled(false);

                mc.draw_line(2, 0,2);
                x[10]=1;
                mp.start();break;
            case R.id.button12:
                v.setEnabled(false);

                mc.draw_line(2, 1,2);
                x[11]=1;
                mp.start();break;
            case R.id.button13:
                v.setEnabled(false);
                x[12]=1;
                mc.draw_line(2, 2,2);
                mp.start();break;
            case R.id.button14:
                v.setEnabled(false);
                x[13]=1;
                mc.draw_line(2, 3,2);
                mp.start();break;
            case R.id.button15:
                v.setEnabled(false);
                x[14]=1;
                mc.draw_line(2, 4,2);
                mp.start();break;
            case R.id.button16:
                v.setEnabled(false);
                x[15]=1;
                mc.draw_line(3, 0,2);
                mp.start();break;
            case R.id.button17:
                v.setEnabled(false);
                x[16]=1;
                mc.draw_line(3, 1,2);
                mp.start();break;
            case R.id.button18:
                v.setEnabled(false);
                x[17]=1;
                mc.draw_line(3, 2,2);
                mp.start();break;
            case R.id.button19:
                v.setEnabled(false);
                x[18]=1;
                mc.draw_line(3, 3,2);
                mp.start();break;
            case R.id.button20:
                v.setEnabled(false);
                x[19]=1;
                mc.draw_line(3, 4,2);
                mp.start();break;
            case R.id.button21:
                v.setEnabled(false);
                x[20]=1;
                mc.draw_line(4, 0,2);
                mp.start();break;
            case R.id.button22:
                v.setEnabled(false);
                x[21]=1;
                mc.draw_line(4, 1,2);
                mp.start();break;
            case R.id.button23:
                v.setEnabled(false);
                x[22]=1;
                mc.draw_line(4, 2,2);
                mp.start();break;
            case R.id.button24:
                v.setEnabled(false);
                x[23]=1;
                mc.draw_line(4, 3,2);
                mp.start();break;
            case R.id.button25:
                v.setEnabled(false);
                x[24]=1;
                mc.draw_line(4, 4,2);
                mp.start();break;
            case R.id.button26:
                v.setEnabled(false);
                x[25]=1;
                mc.draw_line(5, 0,2);
                mp.start();break;
            case R.id.button27:
                v.setEnabled(false);
                x[26]=1;
                mc.draw_line(5, 1,2);

                mp.start();break;
            case R.id.button28:
                v.setEnabled(false);
                x[27]=1;
                mc.draw_line(5, 2,2);
                mp.start();break;
            case R.id.button29:
                v.setEnabled(false);

                mc.draw_line(5, 3,2);
                x[28]=1;
                mp.start();break;
            case R.id.button30:
                v.setEnabled(false);
                x[29]=1;
                mc.draw_line(5, 4,2);
                mp.start();break;
            case R.id.button31:
                v.setEnabled(false);
                x[30]=1;
                mc.draw_v_line(0,0,2);
                mp.start();break;
            case R.id.button32:
                v.setEnabled(false);
                mc.draw_v_line(0, 1,2);
                x[31]=1;
                mp.start();break;
            case R.id.button33:
                v.setEnabled(false);
                mc.draw_v_line(0, 2,2);
                x[32]=1;
                mp.start();break;
            case R.id.button34:
                v.setEnabled(false);
                x[33]=1;
                mc.draw_v_line(0, 3,2);
                mp.start();break;
            case R.id.button35:
                v.setEnabled(false);
                x[34]=1;
                mc.draw_v_line(0, 4,2);

                mp.start();break;
            case R.id.button36:
                v.setEnabled(false);
                mc.draw_v_line(0, 5,2);
                x[35]=1;
                mp.start();break;
            case R.id.button37:
                v.setEnabled(false);
                mc.draw_v_line(1,0,2);
                x[36]=1;
                mp.start();break;
            case R.id.button38:
                v.setEnabled(false);
                mc.draw_v_line(1, 1,2);
                x[37]=1;
                mp.start();break;
            case R.id.button39:
                v.setEnabled(false);
                mc.draw_v_line(1, 2,2);
                x[38]=1;
                mp.start();break;
            case R.id.button40:
                v.setEnabled(false);
                mc.draw_v_line(1, 3,2);
                x[39]=1;
                mp.start();break;
            case R.id.button41:
                v.setEnabled(false);
                mc.draw_v_line(1, 4,2);
                x[40]=1;
                mp.start();break;
            case R.id.button42:
                v.setEnabled(false);
                mc.draw_v_line(1, 5,2);
                x[41]=1;
                mp.start();break;
            case R.id.button43:
                v.setEnabled(false);
                mc.draw_v_line(2, 0,2);
                x[42]=1;
                mp.start();break;
            case R.id.button44:
                v.setEnabled(false);
                mc.draw_v_line(2, 1,2);
                x[43]=1;
                mp.start();break;
            case R.id.button45:
                v.setEnabled(false);
                mc.draw_v_line(2, 2,2);
                x[44]=1;
                mp.start();break;
            case R.id.button46:
                v.setEnabled(false);
                mc.draw_v_line(2, 3,2);
                x[45]=1;
                mp.start();break;
            case R.id.button47:
                v.setEnabled(false);
                mc.draw_v_line(2, 4,2);
                x[46]=1;
                mp.start();break;
            case R.id.button48:
                v.setEnabled(false);
                mc.draw_v_line(2, 5,2);
                x[47]=1;
                mp.start();break;
            case R.id.button49:
                v.setEnabled(false);
                mc.draw_v_line(3, 0,2);
                x[48]=1;
                mp.start();break;
            case R.id.button50:
                v.setEnabled(false);
                mc.draw_v_line(3, 1,2);
                x[49]=1;
                mp.start();break;
            case R.id.button51:
                v.setEnabled(false);
                mc.draw_v_line(3, 2,2);
                x[50]=1;
                mp.start();break;
            case R.id.button52:
                v.setEnabled(false);
                mc.draw_v_line(3, 3,2);
                x[51]=1;
                mp.start();break;
            case R.id.button53:
                v.setEnabled(false);
                mc.draw_v_line(3, 4,2);
                x[52]=1;
                mp.start();break;
            case R.id.button54:
                v.setEnabled(false);
                mc.draw_v_line(3, 5,2);
                x[53]=1;
                mp.start();break;
            case R.id.button55:
                v.setEnabled(false);
                mc.draw_v_line(4, 0,2);
                x[54]=1;
                mp.start();break;
            case R.id.button56:
                v.setEnabled(false);
                mc.draw_v_line(4, 1,2);
                x[55]=1;
                mp.start();break;
            case R.id.button57:
                v.setEnabled(false);
                mc.draw_v_line(4, 2,2);
                x[56]=1;
                mp.start();break;
            case R.id.button58:
                v.setEnabled(false);
                mc.draw_v_line(4, 3,2);
                x[57]=1;
                mp.start();break;
            case R.id.button59:
                v.setEnabled(false);
                mc.draw_v_line(4, 4,2);
                x[58]=1;
                mp.start();break;
            case R.id.button60:
                v.setEnabled(false);
                mc.draw_v_line(4, 5,2);
                x[59]=1;
                mp.start();break;
            case R.id.button61:
                if(block_redo==0)
                {f=mc.undo();
                    undo_change();
                    mp3.start();
                    block_redo2++;
                    block_redo++;}
                else
                    Toast.makeText(screen6by6.this, "Can't undo twice ", Toast.LENGTH_SHORT).show();
                break;

        }//switch case
        if(e==1)
        {
            bgcolor();
        }
        e++;



        for (int j = 0; j < 25; j++) {
            if (j / 5== 0)
                t = 30;
            else if (j / 5 == 1)
                t = 31;
            else if(j/5==2)
                t = 32;
            else if(j/5==3)
                t=33;
            else
                t=34;

            if (x[j] == 1) {
                if (x[j + 5] == 1) {

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
                                    t1_color=mc.get_color(1);
                                    mp2.start();
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
        for(int i=0;i<25;i++)
        {
            if(y[i]==1)
            {
                g++;
            }


        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(g==25)
                {mp4.start();
                mp5.start();
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
                    else
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
                            Intent abc = new Intent(screen6by6.this, MainActivity.class);
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
        { v[f].setEnabled(true);x[f]=0;}
        else
        {
            Toast.makeText(screen6by6.this, "You can't undo a box... ", Toast.LENGTH_LONG).show();
        }



        e=0;
    }
    public void bgcolor()
    {
        v[60].setBackgroundColor(Color.BLUE);
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

        if(a[3]==a[2])
            return 0;
        else
            return a[3];
    }

}//apa

