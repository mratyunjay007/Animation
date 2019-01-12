package com.spirit.tech.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView click,tvhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click=findViewById(R.id.btnclick);
        tvhi=findViewById(R.id.newword);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click.animate().alpha(0).setDuration(1000);
                tvhi.animate().alpha(1).setDuration(1000);
            }
        });
        tvhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvhi.animate().alpha(0).setDuration(1000);

                click.animate().alpha(1).setDuration(1000);


            }
        });





    }

}
