package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    private ImageView imageViewDice;
    private Random rng = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v)
            {
                rollDice();
            }
        });
    }



    private void rollDice()
    {
        int randomNumber = rng.nextInt(20) + 1;

        MediaPlayer critHit = MediaPlayer.create(this, R.raw.firework);
        MediaPlayer critFail = MediaPlayer.create(this, R.raw.toy);
        MediaPlayer roll = MediaPlayer.create(this, R.raw.boop);

        roll.start();

        imageViewDice = findViewById(R.id.image_view_dice);
        TextView words = findViewById(R.id.critical);
        switch(randomNumber)
        {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                words.setText("Critical Miss!");

                critFail.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                words.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                words.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                words.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                words.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                words.setText("");
                break;
            case 7:
                words.setText("");
                imageViewDice.setImageResource(R.drawable.s7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.s8);
                words.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.s9);
                words.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.s10);
                words.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.s11);
                words.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.s12);
                words.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.s13);
                words.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.s14);
                words.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.s15);
                words.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.s16);
                words.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.s17);
                words.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.s18);
                words.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.s19);
                words.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.s20);
                words.setText("Critical Hit!");
                critHit.start();
                break;
        }
    }
}