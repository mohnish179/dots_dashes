package viewsa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;



public class CustomView extends View {

    Paint paint1, paint2,paint5,paint6;//paints
    private static final String TAG = "CustomView";
    static int end=0,end2=0;
    int ctr_g,ctr_b,ctr_r,ctr_y;

    Canvas mBitmapCanvas;
    int check_grid;
    int k, l, m, n, a, b,c,d;//temp values
    int p,q;
    int temp5=100,temp6=800;
    static int flag2 = 0, j = 0, flag = 0, flag3 = 0, flag4 = 0;
    Bitmap mDrawBitmap;
    int[][] cx = new int[6][6];
    int[][] cy = new int[6][6];
    int temp1 = 250;//initial position x co-od for 4 by 4
    int temp2 = 800;//initial position y co-od for 4 by 4
    int temp3 = 150;//initial position x co-od for 5 by 5
    int temp4 = 800;//initial position x co-od for 5 by 5
    int radius = 30;//radius of dots
    int radius3=20;
    int radius2=25;
    int q2;
    Rect rect;//rectangle

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    private void init() {
        paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint6=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setColor(Color.GREEN);
        paint2.setColor(Color.GREEN);

        paint5.setColor(Color.WHITE);//for undo
        paint6.setColor(Color.BLACK);//for the dots
        rect = new Rect();

    }//initialising paint,rect,etc.

    public void get_players(int z)
    {
        p=z;
    }
    public void change_colors()
    {
        if(p==2)
        {
            if(paint1.getColor()==Color.GREEN) {
                paint1.setColor(Color.RED);
                q=1;
            }
            else
            {    paint1.setColor(Color.GREEN);

                q=2;
            }
        }
        if(p==3)
        {
            if(paint1.getColor()==Color.GREEN) {

                paint1.setColor(Color.RED);
                q=1;
            }
            else if(paint1.getColor()==Color.RED) {
                paint1.setColor(Color.BLUE);
                q=3;
            }
            else {
                paint1.setColor(Color.GREEN);
                q=2;
            }
        }
        if(p==4)
        {
            if(paint1.getColor()==Color.GREEN) {
                paint1.setColor(Color.RED);
                q=1;
            }
            else if(paint1.getColor()==Color.RED) {
                paint1.setColor(Color.BLUE);
                q=3;
            }
            else if(paint1.getColor()==Color.BLUE) {
                paint1.setColor(Color.YELLOW);
                q=4;
            }
            else
            { paint1.setColor(Color.GREEN);
            q=2;}
        }
    }
    public int get_color(int i)
    {

        if(i==0) {
            if (p == 2) {
                if (paint1.getColor() == Color.GREEN) {
                    q2 = 1;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 2;
                }
            }
            if (p == 3) {
                if (paint1.getColor() == Color.GREEN) {

                    q2 = 1;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 3;
                } else {
                    q2 = 2;
                }
            }
            if (p == 4) {
                if (paint1.getColor() == Color.GREEN) {
                    q2 = 1;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 3;
                } else if (paint1.getColor() == Color.BLUE) {
                    q2 = 4;
                } else {
                    q2 = 2;
                }
            }
        }
        if(i==1) {
            if (p == 2) {
                if (paint1.getColor() == Color.GREEN) {
                    q2 = 2;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 1;
                }
            }
            if (p == 3) {
                if (paint1.getColor() == Color.GREEN) {

                    q2 = 2;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 1;
                } else if(paint1.getColor()==Color.BLUE)
                {
                    q2 = 3;
                }

            }
            if(p==4)
            {
                if (paint1.getColor() == Color.GREEN) {

                    q2 = 2;
                } else if (paint1.getColor() == Color.RED) {
                    q2 = 1;
                } else if(paint1.getColor()==Color.BLUE)
                {
                    q2 = 3;
                }
                else
                {
                    q2=4;
                }
            }
        }

        return q2;
    }





    public  void stop_change_in_animation()
    {
        if(q==1)
        {
            paint2.setColor(Color.RED);
        }
        else if(q==2)
        {
            paint2.setColor(Color.GREEN);
        }
        else if(q==3)
        {
            paint2.setColor(Color.BLUE);
        }
        else
        {
            paint2.setColor(Color.YELLOW);
        }
    }

    public void draw_line(int x, int y,int z) {
        flag = 1;


        m = x;
        n = y;
       check_grid=z;
        postInvalidate();
    }//instruction to dhl of 4 by 4

    public void draw_v_line(int x, int y,int z) {
        flag2 = 1;
        check_grid=z;
        m = x;
        n = y;
        postInvalidate();
    }//instruction to dvl of 4x4
    public void draw_box(int i) {
        flag3 = 1;
        if(check_grid==0) {

            k = i / 3;
            l = i % 3;
        }
       else if(check_grid==1)
        {
            k = i / 4;
            l = i % 4;
        }
       else
        {
             k=i/5;
             l=i%5;
        }

        postInvalidate();
    }//instruction to dcb of 4 by 4

    public void e_draw_box(int i, int z) {
        flag4 = 1;
        if(check_grid==0)
        {k = i / 3;
        l = i % 3;
        a = z / 3;
        b = z % 3;}
        else if(check_grid==1)
        {
            k = i / 4;
            l = i % 4;
            a = z / 4;
            b = z % 4;
        }
        else
        {
            k = i / 5;
            l = i % 5;
            a = z / 5;
            b = z % 5;
        }
        postInvalidate();

    }//instruction to e_dcb of 4 by 4 (special case to draw to boxes at the same time)

    public void draw_dots(int z) {
        check_grid= z;
        postInvalidate();
    }//runs onDraw to initially draw dots of 4x4





    public int undo()
    {
if(check_grid==0) {

    if (d == 1) {
        change_colors();
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}
        c = (m * 3) + (n);
        mBitmapCanvas.drawRect(rect, paint5);
    } else if (d == 2) {
        change_colors();
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}
        c = 12 + ((m * 3) + m) + n;
        mBitmapCanvas.drawRect(rect, paint5);
    } else
        c = -1;
}
else if(check_grid==1)
{

    if(d==1)
    {change_colors();
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}
        c=(m*4)+(n);
        mBitmapCanvas.drawRect(rect, paint5);}
    else if(d==2) {
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}
        c = 20 + ((m * 4) + m) + n;
        mBitmapCanvas.drawRect(rect, paint5);
    }
    else
        c=-1;
}
else
{
    if(d==1)
    {
        change_colors();
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}c=(m*5)+(n);
        mBitmapCanvas.drawRect(rect, paint5);}
    else if(d==2) {
        change_colors();
        if(p==3)
            change_colors();
        if(p==4)
        {change_colors();
            change_colors();}
        c = 30 + ((m * 5) + m) + n;
        mBitmapCanvas.drawRect(rect, paint5);
    }
    else
        c=-1;
}
        postInvalidate();
        return c;
    }//undo

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        if (mDrawBitmap == null) {
            mDrawBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            mBitmapCanvas = new Canvas(mDrawBitmap);
        }//initialising bitmap
        if (check_grid==0) {

            if (flag == 1) {

                canvas.drawRect(cx[m][n] , cy[m][n] - 10, cx[m][n]+end, cy[m][n]+10, paint1);
                if (end != 200)
                {
                    end+=20;
                    postInvalidateDelayed(1);
                }

                if(end==200)
                {
                    mBitmapCanvas.drawRect(cx[m][n] + 20, cy[m][n] - 10, cx[m][n]+end, cy[m][n]+10, paint1);
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                    change_colors();
                    rect.left=cx[m][n];
                    rect.top=cy[m][n]-10;
                    rect.right=cx[m][n]+200;
                    rect.bottom=cy[m][n]+10;
                    flag=0;
                    end=0;
                    d=1;

                }




            }//horizontal lines
            if (flag2 == 1) {

                canvas.drawRect(cx[m][n] -10,cy[m][n], cx[m][n]+10, cy[m][n]+end, paint1);
                if (end != 200)
                {
                    end+=20;
                    postInvalidateDelayed(1);
                }
                if(end==200)
                {
                    mBitmapCanvas.drawRect(cx[m][n] -10,cy[m][n], cx[m][n]+10, cy[m][n]+end, paint1);
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                    change_colors();
                    rect.left=cx[m][n]-10;
                    rect.top=cy[m][n];
                    rect.right=cx[m][n]+10;
                    rect.bottom=cy[m][n]+200;
                    flag2=0;
                    end=0;
                     d=2;

                }

            }//vertical lines
            if (flag3 == 1) {
                if(end2==0)
                {stop_change_in_animation();


                }


                canvas.drawRect(cx[k][l]+20,cy[k][l]+20, cx[k][l]+end2, cy[k][l]+end2, paint2);

                if (end2 != 180)
                {
                    end2+=10;
                    postInvalidateDelayed(15);
                }
                if(end2==180)
                {change_colors();
                    if(p==3)
                        change_colors();
                    if(p==4)
                    {
                        change_colors();
                        change_colors();
                    }

                    points1();
                    mBitmapCanvas.drawRect(cx[k][l]+20,cy[k][l]+20, cx[k][l]+end2, cy[k][l]+end2, paint1);
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything

                    flag3=0;
                    end2=0;
                    d=3;

                }

            }//correct boxes
            if (flag4 == 1) {
                if(end2==0)
                {
                    stop_change_in_animation();

                }

                canvas.drawRect(cx[k][l]+20,cy[k][l]+20, cx[k][l]+end2, cy[k][l]+end2, paint2);
                canvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a+1][b+1]-20, cy[a+1][b+1] -20, paint2);
                if (end2 != 180)
                {
                    end2+=10;
                    postInvalidateDelayed(15);
                }


                if(end2==180)
                {
                    points2();

                    mBitmapCanvas.drawRect(cx[k][l]+20,cy[k][l]+20, cx[k][l]+end2, cy[k][l]+end2, paint1);

                    mBitmapCanvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a+1][b+1]-20, cy[a+1][b+1] -20, paint1);
                canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                flag4 = 0;
                end2=0;
                d=3;
                }

            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    cx[i][j] = temp1;
                    cy[i][j] = temp2;
                    temp1 += 200;
                    canvas.drawCircle(cx[i][j], cy[i][j], radius, paint6);
                    mBitmapCanvas.drawCircle(cx[i][j], cy[i][j], radius, paint6);

                }//j

                temp1 = 250;
                temp2 += 200;
            }//i_loop+ printing dots
            temp1 = 250;
            temp2 = 800;
            //draw_dots();

                canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything




        }//check_grid_4

        if (check_grid== 1) {

            if (flag == 1) {

                canvas.drawRect(cx[m][n] , cy[m][n] - 10, cx[m][n]+end, cy[m][n]+10, paint1);
                if (end != 200)
                {
                    end+=20;
                    postInvalidateDelayed(1);
                }
                if(end==200)
                {
                    mBitmapCanvas.drawRect(cx[m][n] + 20, cy[m][n] - 10, cx[m][n]+end, cy[m][n]+10, paint1);
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                    change_colors();
                    rect.left=cx[m][n];
                    rect.top=cy[m][n]-10;
                    rect.right=cx[m][n]+200;
                    rect.bottom=cy[m][n]+10;
                    d=1;
                    flag=0;
                    end=0;

                }
            }//horizontal lines
            if (flag2 == 1) {

                canvas.drawRect(cx[m][n] -10,cy[m][n], cx[m][n]+10, cy[m][n]+end, paint1);
                if (end != 200)
                {
                    end+=20;
                    postInvalidateDelayed(1);
                }
                if(end==200)
                {
                    mBitmapCanvas.drawRect(cx[m][n] -10,cy[m][n], cx[m][n]+10, cy[m][n]+end, paint1);
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                    change_colors();
                    rect.left=cx[m][n]-10;
                    rect.top=cy[m][n];
                    rect.right=cx[m][n]+10;
                    rect.bottom=cy[m][n]+200;
                    d=2;
                    flag2=0;
                    end=0;

                }
            }
            if (flag3 == 1) {
                if (end2 == 0) {
                    stop_change_in_animation();
                    points1();
                    }
                    canvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint2);
                    if (end2 != 180) {
                        end2 += 10;
                        postInvalidateDelayed(15);
                    }
                    if (end2 == 180) {
                        change_colors();
                        if (p == 3)
                            change_colors();
                        if (p == 4) {
                            change_colors();
                            change_colors();
                        }

                        mBitmapCanvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint1);
                        canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                        d = 3;
                        flag3 = 0;
                        end2 = 0;

                    }
                }
                if (flag4 == 1) {
                    if (end2 == 0) {
                        stop_change_in_animation();
                        points2();
                         }
                        canvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint2);
                        canvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a][b] + end2, cy[a][b] + end2, paint2);
                        if (end2 != 180) {
                            end2 += 10;
                            postInvalidateDelayed(15);
                        }


                        if (end2 == 180) {


                            mBitmapCanvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint1);
                            mBitmapCanvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a + 1][b + 1] - 20, cy[a + 1][b + 1] - 20, paint1);
                            canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                            flag4 = 0;
                            end2 = 0;
                            d = 3;
                        }
                    }
                    j += 1;

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            cx[i][j] = temp3;
                            cy[i][j] = temp4;
                            temp3 += 200;
                            canvas.drawCircle(cx[i][j], cy[i][j], radius, paint6);
                            mBitmapCanvas.drawCircle(cx[i][j], cy[i][j], radius2, paint6);
                        }
                        temp3 = 150;
                        temp4 += 200;
                    }//i_loop+ printing dots
                    temp3 = 150;
                    temp4 = 800;
                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);
                }//check_grid_5


                if (check_grid == 2) {
                    if (flag == 1) {
                        canvas.drawRect(cx[m][n], cy[m][n] - 10, cx[m][n] + end, cy[m][n] + 10, paint1);
                        if (end != 180) {
                            end += 20;
                            postInvalidateDelayed(1);
                        }
                        if (end == 180) {
                            mBitmapCanvas.drawRect(cx[m][n] + 20, cy[m][n] - 10, cx[m][n] + end, cy[m][n] + 10, paint1);
                            canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                            change_colors();
                            rect.left = cx[m][n];
                            rect.top = cy[m][n] - 10;
                            rect.right = cx[m][n] + 180;
                            rect.bottom = cy[m][n] + 10;
                            flag = 0;
                            end = 0;
                            d= 1;

                        }
                    }//horizontal lines
                    if (flag2 == 1) {

                        canvas.drawRect(cx[m][n] - 10, cy[m][n], cx[m][n] + 10, cy[m][n] + end, paint1);
                        if (end != 180) {
                            end += 20;
                            postInvalidateDelayed(1);
                        }
                        if (end == 180) {
                            mBitmapCanvas.drawRect(cx[m][n] - 10, cy[m][n], cx[m][n] + 10, cy[m][n] + end, paint1);
                            canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                            change_colors();
                            rect.left = cx[m][n]-10;
                            rect.top = cy[m][n] ;
                            rect.right = cx[m][n] + 10;
                            rect.bottom = cy[m][n] + 180;
                            flag2 = 0;
                            end = 0;
                            d= 2;

                        }
                    }
                    if (flag3 == 1) {

                        if (end2 == 0) {
                            stop_change_in_animation();
                            points1();
                            }
                            canvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint2);
                            if (end2 != 150) {
                                end2 += 10;
                                postInvalidateDelayed(15);
                            }
                            if (end2 == 150) {
                                change_colors();
                                if (p == 3)
                                    change_colors();
                                if (p == 4) {
                                    change_colors();
                                    change_colors();
                                }

                                mBitmapCanvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint1);
                                canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                                flag3 = 0;
                                end2 = 0;
                                d = 3;

                            }
                        }
                        if (flag4 == 1) {
                            if (end2 == 0) {
                                stop_change_in_animation();
                                points2();
                                }
                                canvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint2);
                                canvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a][b] + end2, cy[a][b] + end2, paint2);
                                if (end2 != 150) {
                                    end2 += 15;
                                    postInvalidateDelayed(15);
                                }


                                if (end2 == 150) {

                                    mBitmapCanvas.drawRect(cx[k][l] + 20, cy[k][l] + 20, cx[k][l] + end2, cy[k][l] + end2, paint1);
                                    mBitmapCanvas.drawRect(cx[a][b] + 20, cy[a][b] + 20, cx[a][b] + end2, cy[a][b] + end2, paint1);
                                    canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);//drawing everything
                                    flag4 = 0;
                                    end2 = 0;
                                    d = 3;
                                }
                            }
                            j += 1;
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 6; j++) {
                                    cx[i][j] = temp5;
                                    cy[i][j] = temp6;
                                    temp5 += 170;
                                    canvas.drawCircle(cx[i][j], cy[i][j], radius3, paint6);
                                    mBitmapCanvas.drawCircle(cx[i][j], cy[i][j], radius3, paint6);
                                }
                                temp5 = 100;
                                temp6 += 170;
                            }//i_loop+ printing dots
                            temp5 = 100;
                            temp6 = 800;
                            canvas.drawBitmap(mDrawBitmap, 0, 0, paint6);

                        }//6 by 6
                    }//on_draw

                    public void points1() {
                        if (paint2.getColor() == Color.GREEN) {
                            ctr_g += 1;

                            Log.d(TAG, "points: g" + ctr_g);
                        } else if (paint2.getColor() == Color.RED) {
                            ctr_r += 1;
                            Log.d(TAG, "points: r" + ctr_r);
                        } else if (paint2.getColor() == Color.YELLOW) {

                            ctr_y += 1;

                            Log.d(TAG, "points: y" + ctr_y);
                        } else if (paint2.getColor() == Color.BLUE) {
                            ctr_b += 1;
                            Log.d(TAG, "points: b" + ctr_b);
                        }

                    }
                        public void points2()
                        {
                            if (paint2.getColor() == Color.GREEN) {
                                ctr_g += 1;
                                ctr_r--;

                                Log.d(TAG, "points: g" + ctr_g);
                            } else if (paint2.getColor() == Color.RED) {
                                ctr_r += 1;
                                ctr_b--;
                                Log.d(TAG, "points: r" + ctr_r);
                            } else if (paint2.getColor() == Color.YELLOW) {

                                ctr_y += 1;
                                ctr_g--;

                                Log.d(TAG, "points: y" + ctr_y);
                            } else if (paint2.getColor() == Color.BLUE) {
                                ctr_b += 1;
                                ctr_y--;
                                Log.d(TAG, "points: b" + ctr_b);
                            }
                        }


                    public int[] get_score ()
                    {
                        int[] arr = new int[4];
                        arr[0] = ctr_r;
                        arr[1] = ctr_g;
                        arr[2] = ctr_b;
                        arr[3] = ctr_y;
                        Log.d(TAG, "get_score: "+ctr_r+ctr_g);

                        return arr;


                    }


                }//cv











