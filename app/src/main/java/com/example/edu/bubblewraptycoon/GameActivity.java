package com.example.edu.bubblewraptycoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    ProgressBar progressBar;
    ImageButton btnBubble1,btnBubble2,btnBubble3,btnBubble4,btnBubble5,btnBubble6,btnBubble7,btnBubble8,btnBubble9;
    int count=0,result;
    Button btnReset;
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(20);
        progressBar.setProgress(20);

        textViewResult = findViewById(R.id.textViewResult);

        btnBubble1 = findViewById(R.id.btnBubble1);
        btnBubble1.setOnClickListener(this);
        btnBubble2 = findViewById(R.id.btnBubble2);
        btnBubble2.setOnClickListener(this);
        btnBubble3 = findViewById(R.id.btnBubble3);
        btnBubble3.setOnClickListener(this);
        btnBubble4 = findViewById(R.id.btnBubble4);
        btnBubble4.setOnClickListener(this);
        btnBubble5 = findViewById(R.id.btnBubble5);
        btnBubble5.setOnClickListener(this);
        btnBubble6 = findViewById(R.id.btnBubble6);
        btnBubble6.setOnClickListener(this);
        btnBubble7 = findViewById(R.id.btnBubble7);
        btnBubble7.setOnClickListener(this);
        btnBubble8 = findViewById(R.id.btnBubble8);
        btnBubble8.setOnClickListener(this);
        btnBubble9 = findViewById(R.id.btnBubble9);
        btnBubble9.setOnClickListener(this);
        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == btnReset){
            count = 0;
            progressBar.setProgress(20);
            textViewResult.setVisibility(View.GONE);
        }else {
            count = count + 1;
            result = 20-count;
            progressBar.setProgress(result);
            if(result == 0)
                textViewResult.setVisibility(View.VISIBLE);
                textViewResult.setText("축하합니다 당신은 스트레스가0인 건강한 사람입니다.");


        }

    }

}
