package com.app.jonathansapp.munchkincounter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Notes extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notes_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_save) {
            note = notes.getText().toString();

            SharedPreferences preferences = getSharedPreferences("PREFS", 0);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("note", note);
            editor.commit();

            Toast.makeText(Notes.this, "Rules saved", Toast.LENGTH_SHORT).show();

            return true;
        }

        if (id == R.id.menu_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "House Rules:\n" + note);
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }


        return super.onOptionsItemSelected(item);
    }





        EditText notes;
        Button save;
        String note;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.notes);

            notes = (EditText) findViewById(R.id.notes);
            save = (Button) findViewById(R.id.menu_save);
            note = "";

            SharedPreferences preferences = getSharedPreferences("PREFS", 0);
            note = preferences.getString("note", "");

            notes.setText(note);
        }
    }

