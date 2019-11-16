package com.app.jonathansapp.munchkincounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Dice extends AppCompatActivity{
    Button roll;
    ImageView diceimage;
    Random rng = new Random();
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice);

        roll = (Button) findViewById(R.id.roll);
        diceimage = (ImageView) findViewById(R.id.diceimage);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice(){
        int randomnumber = rng.nextInt(6) + 1;

        switch (randomnumber) {
            case 1:
                diceimage.setImageResource(R.drawable.die1);
                Toast toast = Toast.makeText(getApplicationContext(), "You rolled a 1",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;
            case 2:
                diceimage.setImageResource(R.drawable.die2);
                toast = Toast.makeText(getApplicationContext(), "You rolled a 2",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;
            case 3:
                diceimage.setImageResource(R.drawable.die3);
                toast = Toast.makeText(getApplicationContext(), "You rolled a 3",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;
            case 4:
                diceimage.setImageResource(R.drawable.die4);
                toast = Toast.makeText(getApplicationContext(), "You rolled a 4",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;
            case 5:
                diceimage.setImageResource(R.drawable.die5);
                toast = Toast.makeText(getApplicationContext(), "You rolled a 5",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;
            case 6:
                diceimage.setImageResource(R.drawable.die6);
                toast = Toast.makeText(getApplicationContext(), "You rolled a 6",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RELATIVE_LAYOUT_DIRECTION| Gravity.CENTER_HORIZONTAL, 0, 300);
                toast.show();
                break;

        }
    }



}
