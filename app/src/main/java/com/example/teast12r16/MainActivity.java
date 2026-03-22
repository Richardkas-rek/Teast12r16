package com.example.teast12r16;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    ToggleButton tg;
    Button btn;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.mySwitch);
        tg = findViewById(R.id.myToggle);
        btn = findViewById(R.id.myButton);
        layout = findViewById(R.id.mainLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean s = sw.isChecked();
                boolean t = tg.isChecked();

                if (!s && !t) {
                    layout.setBackgroundColor(Color.parseColor("#222222"));
                }
                else if (s && !t) {
                    layout.setBackgroundColor(Color.parseColor("#CC6666"));
                }
                else if (!s && t) {
                    layout.setBackgroundColor(Color.parseColor("#6699CC"));
                }
                else if (s && t) {
                    layout.setBackgroundColor(Color.parseColor("#9966CC"));
                }
            }
        });
    }
}