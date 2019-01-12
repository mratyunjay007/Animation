package com.spirit.tech.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView click=findViewById(R.id.btnclick);
       final TextView tvhi=findViewById(R.id.newword);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.animate().alpha(0).setDuration(2000);
                tvhi.animate().alpha(1).setDuration(4000);

            }
        });
    }
}
