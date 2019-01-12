package com.spirit.tech.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView click,tvhi,tvandroid;
    boolean flag;
    Button btnUi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.btnclick);
        tvhi = findViewById(R.id.newword);
        tvandroid=findViewById(R.id.tvandroid);
        btnUi=findViewById(R.id.btnUi);

        btnUi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.animate().scaleX(1f).rotation(14400).setDuration(2000);
                tvhi.animate().alpha(1).translationY(0).rotation(-3600).setDuration(20000);
                tvandroid.animate().translationY(0).scaleX(0.5f).scaleY(0.5f).setDuration(5000);



            }
        });

//        click.setOnClickListener(this);

    }

//    @Override
//    public void onClick(View v) {
//        if(v.getId()==R.id.btnclick)
//        {
//            if (!flag) {
//                flag = true;
//
//                click.animate().alpha(0).setDuration(3000);
//                tvhi.animate().alpha(1).setDuration(3000);
//            } else {
//                flag = false;
//                click.animate().alpha(1).setDuration(3000);
//                tvhi.animate().alpha(0).setDuration(3000);
//
//            }
//        }
//    }
}

