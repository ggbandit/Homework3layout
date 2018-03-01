package com.example.skiperfam.homework3layout;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    RelativeLayout rl;
    Button image1,image2,image3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (RelativeLayout)findViewById(R.id.RelativeLayout1);
        image1 = (Button)findViewById(R.id.button1);
        image2 = (Button)findViewById(R.id.button2);
        image3 = (Button)findViewById(R.id.button3);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        image1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rl.setBackgroundResource(R.drawable.background_image);
                tv1.setTextColor(Color.RED);
                tv2.setTextColor(Color.BLACK);
                tv3.setTextColor(Color.BLACK);
                tv4.setTextColor(Color.BLACK);
            }
        });


        image2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rl.setBackgroundResource(R.drawable.background_image_2);
                tv1.setTextColor(Color.RED);
                tv2.setTextColor(Color.BLACK);
                tv3.setTextColor(Color.BLACK);
                tv4.setTextColor(Color.BLACK);
            }
        });


        image3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                rl.setBackgroundResource(R.drawable.background_image_3);
                tv1.setTextColor(Color.RED);
                tv2.setTextColor(Color.BLACK);
                tv3.setTextColor(Color.BLACK);
                tv4.setTextColor(Color.BLACK);
            }
        });

    }
}
