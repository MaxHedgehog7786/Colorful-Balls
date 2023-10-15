package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.Random;

public class MyView extends View {
    int x1Scor;
    int y1Scor;
    int x1Koord;
    int y1Koord;
    int x2Scor;
    int y2Scor;
    int x2Koord;
    int y2Koord;
    int x3Scor;
    int y3Scor;
    int x3Koord;
    int y3Koord;
    public MyView(Context context) {
        super(context);
    }

    boolean vhod1 = true;
    boolean vhod2 = true;
    boolean vhod3 = true;
    @Override
    protected void onDraw(@NonNull Canvas canvas){
        super.onDraw(canvas);
        //Spawn
        Paint paintgr = new Paint();
        paintgr.setColor(Color.GRAY);
        paintgr.setStyle(Paint.Style.FILL_AND_STROKE);
        paintgr.setTextSize(100.0f);
        canvas.drawText("Spawn",canvas.getWidth()/2,canvas.getHeight()/2, paintgr);

        //Шар 1
        if(vhod1){
            x1Koord = canvas.getWidth()/2;
            y1Koord = canvas.getHeight()/2;
            vhod1 = false;
            x1Scor = (int) (Math.random()*100+-50);
            y1Scor = (int) (Math.random()*100+-50);
        }
        if(vhod2){
            x2Koord = canvas.getWidth()/2;
            y2Koord = canvas.getHeight()/2;
            vhod2 = false;
            x2Scor = (int) (Math.random()*100+-50);
            y2Scor = (int) (Math.random()*100+-50);
        }
        if(vhod3){
            x3Koord = canvas.getWidth()/2;
            y3Koord = canvas.getHeight()/2;
            vhod3 = false;
            x3Scor = (int) (Math.random()*100-50);
            y3Scor = (int) (Math.random()*100+-50);
        }


        Paint paintr = new Paint();
        paintr.setColor(Color.RED);
        paintr.setStyle(Paint.Style.FILL);
        x1Koord+=x1Scor;
        y1Koord+=y1Scor;
        canvas.drawCircle(x1Koord, y1Koord, 100, paintr);
        if (x1Koord<0 || y1Koord<0 || x1Koord>canvas.getWidth() || x1Koord>canvas.getHeight()){
            vhod1 = true;
        }

        //Шар 2




        Paint paintb = new Paint();
        paintb.setColor(Color.BLUE);
        paintb.setStyle(Paint.Style.FILL);
        x2Koord+=x2Scor;
        y2Koord+=y2Scor;
        canvas.drawCircle(x2Koord, y2Koord, 100, paintb);
        if (x2Koord<0 || y2Koord<0 || x2Koord>canvas.getWidth() || x2Koord>canvas.getHeight()){
            vhod2 = true;
        }

        //Шар 3




        Paint paintg = new Paint();
        paintg.setColor(Color.GREEN);
        paintg.setStyle(Paint.Style.FILL);
        x3Koord+=x3Scor;
        y3Koord+=y3Scor;
        canvas.drawCircle(x3Koord, y3Koord, 100, paintg);
        if (x3Koord<0 || y3Koord<0 || x3Koord>canvas.getWidth() || x3Koord>canvas.getHeight()){
            vhod3 = true;
        }
        invalidate();
    }
}
