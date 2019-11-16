package com.app.jonathansapp.munchkincounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Threeplayer extends AppCompatActivity {

    ImageButton gendertoggle1, gendertoggle2, gendertoggle3;
    int counter1 = 1, counter2 = 1, counter3 = 1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threeplayer);


       // Toggle Gender

        gendertoggle1 = (ImageButton) findViewById(R.id.gender1);
        gendertoggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle1.setActivated(!gendertoggle1.isActivated());
            }
        });

        gendertoggle2 = (ImageButton) findViewById(R.id.gender2);
        gendertoggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle2.setActivated(!gendertoggle2.isActivated());
            }
        });

        gendertoggle3 = (ImageButton) findViewById(R.id.gender3);
        gendertoggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle3.setActivated(!gendertoggle3.isActivated());
            }
        });


        //Level Counter

        final TextView result1 = (TextView) findViewById(R.id.result1);
        final TextView result2 = (TextView) findViewById(R.id.result2);
        final TextView result3 = (TextView) findViewById(R.id.result3);
        Button up1 = (Button) findViewById(R.id.up1);
        Button down1 = (Button) findViewById(R.id.down1);
        Button up2 = (Button) findViewById(R.id.up2);
        Button down2 = (Button) findViewById(R.id.down2);
        Button up3 = (Button) findViewById(R.id.up3);
        Button down3 = (Button) findViewById(R.id.down3);

        up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1 = counter1 + 1;
                result1.setText("" + counter1);
            }
        });
        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1 = counter1 - 1;
                result1.setText("" + counter1);
            }
        });
        up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2 = counter2 + 1;
                result2.setText("" + counter2);
            }
        });
        down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2 = counter2 - 1;
                result2.setText("" + counter2);
            }
        });
        up3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3 = counter3 + 1;
                result3.setText("" + counter3);
            }
        });
        down3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3 = counter3 - 1;
                result3.setText("" + counter3);
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_battle) {
            Intent intent1 = new Intent(this,Battle.class);
            this.startActivity(intent1);
            return true;
        }

        if (id == R.id.menu_roll) {
            Intent intent2 = new Intent(this,Dice.class);
            this.startActivity(intent2);
            return true;
        }

        if (id == R.id.menu_notes) {
            Intent intent3 = new Intent(this,Notes.class);
            this.startActivity(intent3);
            return true;
        }

        if (id == R.id.menu_end) {
            Intent intent4 = new Intent(this,MainActivity.class);
            this.startActivity(intent4);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }


}

