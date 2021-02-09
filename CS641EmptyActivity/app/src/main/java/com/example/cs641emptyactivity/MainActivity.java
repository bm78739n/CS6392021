package com.example.cs641emptyactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_click = (Button)findViewById(R.id.button);
        btn_click.setText("CLICK ME!");
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log log;
                Log.d("MAINACTIVITY", "In onClick for btn_click");
                btn_click.setText("Clicked :-(");

            }
        });
    }
}