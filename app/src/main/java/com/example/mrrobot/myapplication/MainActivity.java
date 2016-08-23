package com.example.mrrobot.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button addone, addtwo, addthree, subone, subtwo, subthree, playagain, exit;
    private TextView giventext, added;
    private Random rand = new Random();
    int randomgivenno = rand.nextInt(50);
    private RelativeLayout mainlay;
    private RelativeLayout sublay;


    int sum = 0;
    int randomone = rand.nextInt(9);
    int randomtwo = rand.nextInt(9);
    int randomthree = rand.nextInt(9);
    int random2one = rand.nextInt(9);
    int random2two = rand.nextInt(9);
    int random2three = rand.nextInt(9);






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giventext = (TextView) findViewById(R.id.givenrandomtext);
        giventext.setText(String.valueOf(randomgivenno));
        mainlay = (RelativeLayout) findViewById(R.id.layone);
        sublay = (RelativeLayout) findViewById(R.id.relative);
        playagain = (Button) findViewById(R.id.play);
        exit = (Button) findViewById(R.id.exit);
        addone = (Button) findViewById(R.id.buttonone);
        addtwo = (Button) findViewById(R.id.buttontwo);
        addthree = (Button) findViewById(R.id.buttonthree);
        subone = (Button) findViewById(R.id.button2one);
        subtwo = (Button) findViewById(R.id.button2two);
        subthree = (Button) findViewById(R.id.button2three);
        added = (TextView) findViewById(R.id.addedno);
        added.setText(String.valueOf(sum));
        addone.setText(String.valueOf("+"+randomone));
        addthree.setText(String.valueOf("+"+randomthree));
        addtwo.setText(String.valueOf("+"+randomtwo));
        subone.setText(String.valueOf("-"+random2one));
        subthree.setText(String.valueOf("-"+random2three));
        subtwo.setText(String.valueOf("-"+random2two));


        addone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(addone.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));


                buttonfun();
            }
        });
        addtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(addtwo.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));

                buttonfun();
            }
        });
        addthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(addthree.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));

                buttonfun();
            }
        });
        subone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(subone.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));

                buttonfun();
            }
        });
        subtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(subtwo.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));

                buttonfun();
            }
        });
        subthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(subthree.getText().toString());
                sum = sum + value;
                added.setText(String.valueOf(sum));

                buttonfun();
            }
        });









    }

    private void buttonfun() {


        randomone = rand.nextInt(9);
        randomtwo = rand.nextInt(9);
        randomthree = rand.nextInt(9);
        random2one = rand.nextInt(9);
        random2two = rand.nextInt(9);
        random2three = rand.nextInt(9);


        addone.setText(String.valueOf("+"+randomone));
        addthree.setText(String.valueOf("+"+randomthree));
        addtwo.setText(String.valueOf("+"+randomtwo));
        subone.setText(String.valueOf("-"+random2one));
        subthree.setText(String.valueOf("-"+random2three));
        subtwo.setText(String.valueOf("-"+random2two));

        int addedvalue = Integer.parseInt(added.getText().toString());
        if (randomgivenno == addedvalue) {




            sublay.setVisibility(View.VISIBLE);

            playagain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sum = 0;
                    added.setText(String.valueOf(sum));

                    buttonfun();
                    randomgivenno = rand.nextInt(50);

                    giventext.setText(String.valueOf(randomgivenno));
                    buttonfun();

                    sublay.setVisibility(View.INVISIBLE);

                }
            });

            exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.this.finish();
                }
            });


        }
    }

}
