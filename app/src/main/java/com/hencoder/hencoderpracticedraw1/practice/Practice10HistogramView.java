package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    Paint paint = new Paint();
    int[] array = new int[]{5, 20, 20, 100, 180, 200, 80};
    String[] name = new String[]{"Froyo", "GB", "ICS", "JB", "Kitkat", "L", "M"};
    int pos = 0;

    int left = 50;
    int right = 600;
    int top = 50;
    int bottom = 400;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图



        pos = left;
        for (int i=0; i<array.length; ++i) {
            pos += 20;
            paint.setColor(Color.GREEN);
            canvas.drawRect(pos, bottom - array[i], pos + 50, bottom, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText(name[i], pos + 10, bottom + 30, paint);

            pos += 50;
        }

        paint.setColor(Color.WHITE);
        canvas.drawLine(left, top, left, bottom, paint);
        canvas.drawLine(left, bottom, right, bottom, paint);

        canvas.drawText("直方图", 300, 500, paint);

    }
}
