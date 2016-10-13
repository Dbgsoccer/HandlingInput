package com.example.chrisbennett.handlinginput;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {


    private MyView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (MyView) findViewById(R.id.canvas);
    }
    //I am not sure where I am supposed to put this....
    protected void changeColor (Paint p, View v){
        p.setColor(Color.GREEN);
    }





}
