package com.mehdi.xo;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int b1 = 0;
    private int b2 = 0;
    private int b3 = 0;
    private int b4 = 0;
    private int b5 = 0;
    private int b6 = 0;
    private int b7 = 0;
    private int b8 = 0;
    private int b9 = 0;

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;

    private int ply1 = 0;
    private int ply2 = 0;

    LinearLayout game;
    TextView winner;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);

        winner = findViewById(R.id.winner);

        game = findViewById(R.id.game);

        Button but = findViewById(R.id.rest);

        share = findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = ShareCompat.IntentBuilder.from(MainActivity.this).setType("text/plain").setChooserTitle("result").setText(winner.getText().toString()).getIntent();
                startActivity(i);
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rest();
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt1.setBackgroundColor(getResources().getColor(R.color.red));
                    bt1.setText("x");
                    b1 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt1.setBackgroundColor(getResources().getColor(R.color.black));
                    bt1.setText("o");
                    b1 = 5;
                    hasWinner();
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt2.setBackgroundColor(getResources().getColor(R.color.red));
                    bt2.setText("x");
                    b2 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt2.setBackgroundColor(getResources().getColor(R.color.black));
                    bt2.setText("o");
                    b2 = 5;
                    hasWinner();
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt3.setBackgroundColor(getResources().getColor(R.color.red));
                    bt3.setText("x");
                    b3 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt3.setBackgroundColor(getResources().getColor(R.color.black));
                    bt3.setText("o");
                    b3 = 5;
                    hasWinner();
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt4.setBackgroundColor(getResources().getColor(R.color.red));
                    bt4.setText("x");
                    b4 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt4.setBackgroundColor(getResources().getColor(R.color.black));
                    bt4.setText("o");
                    b4 = 5;
                    hasWinner();
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt5.setBackgroundColor(getResources().getColor(R.color.red));
                    bt5.setText("x");
                    b5 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt5.setBackgroundColor(getResources().getColor(R.color.black));
                    bt5.setText("o");
                    b5 = 5;
                    hasWinner();
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt6.setBackgroundColor(getResources().getColor(R.color.red));
                    bt6.setText("x");
                    b6 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt6.setBackgroundColor(getResources().getColor(R.color.black));
                    bt6.setText("o");
                    b6 = 5;
                    hasWinner();
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt7.setBackgroundColor(getResources().getColor(R.color.red));
                    bt7.setText("x");
                    b7 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt7.setBackgroundColor(getResources().getColor(R.color.black));
                    bt7.setText("o");
                    b7 = 5;
                    hasWinner();
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt8.setBackgroundColor(getResources().getColor(R.color.red));
                    bt8.setText("x");
                    b8 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt8.setBackgroundColor(getResources().getColor(R.color.black));
                    bt8.setText("o");
                    b8 = 5;
                    hasWinner();
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ply1 == ply2){
                    ply1++;
                    bt9.setBackgroundColor(getResources().getColor(R.color.red));
                    bt9.setText("x");
                    b9 = 1;
                    hasWinner();
                } else if (ply1 > ply2){
                    ply2++;
                    bt9.setBackgroundColor(getResources().getColor(R.color.black));
                    bt9.setText("o");
                    b9 = 5;
                    hasWinner();
                }
            }
        });

        winner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rest();
            }
        });
    }

    private void hasWinner(){

        int raw1 = b1 + b2 + b3;
        int raw2 = b4 + b5 + b6;
        int raw3 = b7 + b8 + b9;
        int cln1 = b1 + b4 + b7;
        int cln2 = b2 + b5 + b8;
        int cln3 = b3 + b6 + b9;
        int A = b1 + b5 + b9;
        int B = b3 + b5 + b7;

            if (raw1 == 3 || raw2 == 3 || raw3 == 3 || cln1 == 3 || cln2 == 3 || cln3 == 3 || A == 3 || B == 3){
                game.setVisibility(View.GONE);
                winner.setVisibility(View.VISIBLE);
                winner.setText("  Player 1 \n is wenner");
                share.setVisibility(View.VISIBLE);
            }else if (raw1 == 15 || raw2 == 15 || raw3 == 15 || cln1 == 15 || cln2 == 15 || cln3 == 15 || A == 15 || B == 15){
                game.setVisibility(View.GONE);
                winner.setVisibility(View.VISIBLE);
                winner.setText("  Player 2 \n is wenner");
                share.setVisibility(View.VISIBLE);
            }

    }

    private void rest(){
        share.setVisibility(View.GONE);
        game.setVisibility(View.VISIBLE);
        winner.setVisibility(View.GONE);
        ply1 = 0;
        ply2 = 0;
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        bt1.setBackgroundColor(getResources().getColor(R.color.norml));
        bt2.setBackgroundColor(getResources().getColor(R.color.norml));
        bt3.setBackgroundColor(getResources().getColor(R.color.norml));
        bt4.setBackgroundColor(getResources().getColor(R.color.norml));
        bt5.setBackgroundColor(getResources().getColor(R.color.norml));
        bt6.setBackgroundColor(getResources().getColor(R.color.norml));
        bt7.setBackgroundColor(getResources().getColor(R.color.norml));
        bt8.setBackgroundColor(getResources().getColor(R.color.norml));
        bt9.setBackgroundColor(getResources().getColor(R.color.norml));

    }
}
