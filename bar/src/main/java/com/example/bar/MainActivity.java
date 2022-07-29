package com.example.bar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt=findViewById(R.id.btn);
        ProgressBar pb=findViewById(R.id.pb);
        Button bnt1=findViewById(R.id.btn1);
        ProgressBar pb1=findViewById(R.id.pb1);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pb.getVisibility()==View.GONE)
                {
                    pb.setVisibility(View.VISIBLE);
                }
                else
                {
                    pb.setVisibility(View.GONE);
                }
            }
        });

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int progress =pb1.getProgress();
                progress+=10;
                pb1.setProgress(progress);
            }
        });
    }

}