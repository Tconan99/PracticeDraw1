package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public void drawArc(Canvas canvas, float px, float py, float startAngle,
                        float sweepAngle, boolean useCenter) {
        canvas.drawArc(100 + px, 100 + py, 400 + px, 400 + py, startAngle, sweepAngle, useCenter, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.WHITE);
        canvas.drawLine(50, 100, 140, 100, paint);
        canvas.drawLine(140, 100, 170, 170, paint);
        canvas.drawText("Lollipop", 0, 100, paint);

        canvas.drawLine(100, 400, 140, 400, paint);
        canvas.drawLine(140, 400, 210, 330, paint);
        canvas.drawText("Kitkat", 50, 400, paint);

        canvas.drawLine(360, 220, 400, 180, paint);
        canvas.drawLine(400, 180, 500, 180, paint);
        canvas.drawText("Marshmallow", 510, 180, paint);

        canvas.drawLine(400, 245, 500, 245, paint);
        canvas.drawText("Froyo", 510, 250, paint);

        canvas.drawLine(390, 260, 430, 260, paint);
        canvas.drawLine(430, 260, 450, 280, paint);
        canvas.drawLine(450, 280, 500, 280, paint);
        canvas.drawText("Gingerbread", 510, 280, paint);

        canvas.drawLine(390, 275, 430, 275, paint);
        canvas.drawLine(430, 275, 450, 300, paint);
        canvas.drawLine(450, 300, 500, 300, paint);
        canvas.drawText("Ice Cream Sandwich", 510, 300, paint);

        canvas.drawLine(360, 310, 400, 350, paint);
        canvas.drawLine(400, 350, 500, 350, paint);
        canvas.drawText("Jelly Bean", 510, 350, paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.RED);
        drawArc(canvas, -10, -10, -180, 100, true);

        paint.setColor(Color.YELLOW);
        drawArc(canvas, 0, 2, -80, 75, true);

        paint.setColor(Color.WHITE);
        drawArc(canvas, 0, 0, -5, 5, true);

        paint.setColor(Color.BLACK);
        drawArc(canvas, 0, 0, 0, 5, true);

        paint.setColor(Color.GRAY);
        drawArc(canvas, 0, 0, 7, 5, true);

        paint.setColor(Color.GREEN);
        drawArc(canvas, 0, 0, 15, 65, true);

        paint.setColor(Color.BLUE);
        drawArc(canvas, 0, 0, 82, 95, true);

    }
}
