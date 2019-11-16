package com.app.jonathansapp.munchkincounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Battle extends AppCompatActivity {

    int counter1 = 0;
    int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle);
    }

    public void up1(View view) {
        counter1 = counter1 + 1;
        display1(counter1);
        winner(counter1,counter2);
    }

    public void down1(View view) {
        counter1 = counter1 - 1;
        display1(counter1);
        winner(counter1,counter2);
    }


    public void up2(View view) {
        counter2 = counter2 + 1;
        display2(counter2);
        winner(counter1,counter2);
    }

    public void down2(View view) {
        counter2 = counter2 - 1;
        display2(counter2);
        winner(counter1,counter2);
    }


    private void display1(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.result1);
        displayInteger.setText("" + number);
    }

    private void display2(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.result2);
        displayInteger.setText("" + number);
    }


    private void winner(int number, int number2) {
        TextView displayWinner = (TextView) findViewById(
                R.id.winner);

        if (counter2 >= counter1)
        displayWinner.setText("The monster is winning");
        else
        displayWinner.setText("The player is winning");

    }
}