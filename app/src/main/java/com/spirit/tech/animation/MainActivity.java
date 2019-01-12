package com.spirit.tech.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView click,tvhi;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.btnclick);
        tvhi = findViewById(R.id.newword);

        click.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnclick)
        {
            if (!flag) {
                flag = true;

                click.animate().alpha(0).setDuration(3000);
                tvhi.animate().alpha(1).setDuration(3000);
            } else {
                flag = false;
                click.animate().alpha(1).setDuration(3000);
                tvhi.animate().alpha(0).setDuration(3000);

            }
        }
    }
}

