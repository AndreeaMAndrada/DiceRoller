package com.example.diceroller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void on_button_click(View view){
        final TextView tv = this.findViewById(R.id.but);
        Random r= new Random();

        int number = r.nextInt ( 6);
        number +=1;

        EditText field = this.findViewById(R.id.entern);
        TextView gz =this.findViewById(R.id.Gratz);
        TextView point =this.findViewById(R.id.point);
        String numbeer= field.getText().toString();
        int nr = Integer.parseInt(numbeer);
        if (nr==number){
            gz.setText("Congratulations");

            points+=1;
            int score=points;
            point.setText("Points:"+ score );}
        else {
            points+=0;
        }

        tv.setText(Integer.toString(number));

    }
    public void roll_the_dice(View view){
        Random r = new Random();
        int number = r.nextInt(6);
        number += 1;
        TextView ice = this.findViewById(R.id.ice);


        if (number == 1) ice.setText("If you could go anywhere in the world, where would you go?");
        else if (number == 2) {
            ice.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        } else if (number == 3) {
            ice.setText("If you could eat only one food for the rest of your life, what would that be?");
        } else if (number == 4) {
            ice.setText("If you won a million dollars, what is the first thing you would buy?");

        } else if (number == 5) {
            ice.setText("If you could spaned the day with one fictional character, who would it be?");
        } else if (number == 6) {
            ice.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }
    }





}


