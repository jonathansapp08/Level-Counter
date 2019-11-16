package com.app.jonathansapp.munchkincounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players);


        Button button3 = (Button) findViewById(R.id.three);
        Button button4 = (Button) findViewById(R.id.four);
        Button button5 = (Button) findViewById(R.id.five);
        Button button6 = (Button) findViewById(R.id.six);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = (new Intent(Players.this, Threeplayer.class));
                startActivity(int1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = (new Intent(Players.this, Fourplayer.class));
                startActivity(int2);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Players.this, Fiveplayer.class));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Players.this, Sixplayer.class));
            }
        });



    }
}
