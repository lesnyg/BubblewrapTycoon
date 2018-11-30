package com.example.edu.bubblewraptycoon;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    ProgressBar progressBar;
    ImageButton btnBubble1, btnBubble2, btnBubble3, btnBubble4, btnBubble5, btnBubble6, btnBubble7, btnBubble8, btnBubble9;
    ImageView imageboom1, imageboom2, imageboom3, imageboom4, imageboom5, imageboom6, imageboom7, imageboom8, imageboom9;
    int count = 0, result;
    Button btnReset;
    TextView textViewResult;
    MediaPlayer mp;

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
        imageboom1 = findViewById(R.id.imageboom1);
        imageboom2 = findViewById(R.id.imageboom2);
        imageboom3 = findViewById(R.id.imageboom3);
        imageboom4 = findViewById(R.id.imageboom4);
        imageboom5 = findViewById(R.id.imageboom5);
        imageboom6 = findViewById(R.id.imageboom6);
        imageboom7 = findViewById(R.id.imageboom7);
        imageboom8 = findViewById(R.id.imageboom8);
        imageboom9 = findViewById(R.id.imageboom9);


    }

    @Override
    public void onClick(View v) {
        final Handler handler = new Handler();

        if (v == btnReset) {
            count = 0;
            progressBar.setProgress(20);
            textViewResult.setVisibility(View.GONE);
            btnBubble1.setEnabled(true);
            btnBubble2.setEnabled(true);
            btnBubble3.setEnabled(true);
            btnBubble4.setEnabled(true);
            btnBubble5.setEnabled(true);
            btnBubble6.setEnabled(true);
            btnBubble7.setEnabled(true);
            btnBubble8.setEnabled(true);
            btnBubble9.setEnabled(true);
        } else {
            count = count+1;
            result = 20 - count;
            progressBar.setProgress(result);
            if (result == 0){
                btnBubble1.setEnabled(false);
                btnBubble2.setEnabled(false);
                btnBubble3.setEnabled(false);
                btnBubble4.setEnabled(false);
                btnBubble5.setEnabled(false);
                btnBubble6.setEnabled(false);
                btnBubble7.setEnabled(false);
                btnBubble8.setEnabled(false);
                btnBubble9.setEnabled(false);



//                btnBubble1.setVisibility(View.GONE);
//                btnBubble2.setVisibility(View.GONE);
//                btnBubble3.setVisibility(View.GONE);
//                btnBubble4.setVisibility(View.GONE);
//                btnBubble5.setVisibility(View.GONE);
//                btnBubble6.setVisibility(View.GONE);
//                btnBubble7.setVisibility(View.GONE);
//                btnBubble8.setVisibility(View.GONE);
//                btnBubble9.setVisibility(View.GONE);
                textViewResult.setVisibility(View.VISIBLE);
                textViewResult.setText("한판더!!");

            }
            switch (v.getId()) {
            case R.id.btnBubble1:
                sound();
                btnBubble1.setVisibility(View.GONE);
                imageboom1.setVisibility(View.VISIBLE);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom1.setVisibility(View.GONE);
                        btnBubble1.setVisibility(View.VISIBLE);
                       // mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble2:
                sound();
                btnBubble2.setVisibility(View.GONE);
                imageboom2.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom2.setVisibility(View.GONE);
                        btnBubble2.setVisibility(View.VISIBLE);
                       // mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble3:
                sound();
                btnBubble3.setVisibility(View.GONE);
                imageboom3.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom3.setVisibility(View.GONE);
                        btnBubble3.setVisibility(View.VISIBLE);
                        //mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble4:
                sound();
                btnBubble4.setVisibility(View.GONE);
                imageboom4.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom4.setVisibility(View.GONE);
                        btnBubble4.setVisibility(View.VISIBLE);
                       // mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble5:
                sound();
                btnBubble5.setVisibility(View.GONE);
                imageboom5.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom5.setVisibility(View.GONE);
                        btnBubble5.setVisibility(View.VISIBLE);
                       // mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble6:
                sound();
                btnBubble6.setVisibility(View.GONE);
                imageboom6.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom6.setVisibility(View.GONE);
                        btnBubble6.setVisibility(View.VISIBLE);
                      //  mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble7:
                sound();
                btnBubble7.setVisibility(View.GONE);
                imageboom7.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom7.setVisibility(View.GONE);
                        btnBubble7.setVisibility(View.VISIBLE);
                      //  mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble8:
                sound();
                btnBubble8.setVisibility(View.GONE);
                imageboom8.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom8.setVisibility(View.GONE);
                        btnBubble8.setVisibility(View.VISIBLE);
                      //  mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;
            case R.id.btnBubble9:
                sound();
                btnBubble9.setVisibility(View.GONE);
                imageboom9.setVisibility(View.VISIBLE);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageboom9.setVisibility(View.GONE);
                        btnBubble9.setVisibility(View.VISIBLE);
                      //  mp.stop();
                    }
                }, 2000);
                mp.stop();
                break;

        }

        }
    }


    public void sound() {
        mp = new MediaPlayer().create(this, R.raw.bubble3);
        mp.start();
    }

}
