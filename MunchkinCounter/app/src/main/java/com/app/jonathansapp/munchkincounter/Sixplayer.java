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
import android.widget.TextView;

public class Sixplayer extends AppCompatActivity {

    ImageButton gendertoggle1, gendertoggle2, gendertoggle3, gendertoggle4, gendertoggle5, gendertoggle6;
    int counter1=0, counter2=0, counter3=0, counter4=0, counter5=0, counter6=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixplayer);


        //Toggle Gender

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

        gendertoggle4 = (ImageButton) findViewById(R.id.gender4);
        gendertoggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle4.setActivated(!gendertoggle4.isActivated());
            }
        });

        gendertoggle5 = (ImageButton) findViewById(R.id.gender5);
        gendertoggle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle5.setActivated(!gendertoggle5.isActivated());
            }
        });

        gendertoggle6 = (ImageButton) findViewById(R.id.gender6);
        gendertoggle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gendertoggle6.setActivated(!gendertoggle6.isActivated());
            }
        });


        //Level Counter

        final TextView result1 = (TextView) findViewById(R.id.result1);
        final TextView result2 = (TextView) findViewById(R.id.result2);
        final TextView result3 = (TextView) findViewById(R.id.result3);
        final TextView result4 = (TextView) findViewById(R.id.result4);
        final TextView result5 = (TextView) findViewById(R.id.result5);
        final TextView result6 = (TextView) findViewById(R.id.result6);
        Button up1 = (Button) findViewById(R.id.up1);
        Button down1 = (Button) findViewById(R.id.down1);
        Button up2 = (Button) findViewById(R.id.up2);
        Button down2 = (Button) findViewById(R.id.down2);
        Button up3 = (Button) findViewById(R.id.up3);
        Button down3 = (Button) findViewById(R.id.down3);
        Button up4 = (Button) findViewById(R.id.up4);
        Button down4 = (Button) findViewById(R.id.down4);
        Button up5 = (Button) findViewById(R.id.up5);
        Button down5 = (Button) findViewById(R.id.down5);
        Button up6 = (Button) findViewById(R.id.up6);
        Button down6 = (Button) findViewById(R.id.down6);

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
        up4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4 = counter4 + 1;
                result4.setText("" + counter4);
            }
        });
        down4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4 = counter4 - 1;
                result4.setText("" + counter4);
            }
        });
        up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5 = counter5 + 1;
                result5.setText("" + counter5);
            }
        });
        down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5 = counter5 - 1;
                result4.setText("" + counter5);
            }
        });
        up6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6 = counter6 + 1;
                result6.setText("" + counter6);
            }
        });
        down6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6 = counter6 - 1;
                result6.setText("" + counter6);
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

