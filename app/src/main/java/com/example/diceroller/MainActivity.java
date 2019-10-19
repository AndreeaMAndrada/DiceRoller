package com.example.diceroller;

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

        final int number = r.nextInt ( 6);
        EditText field = this.findViewById(R.id.entern);
        TextView gz =this.findViewById(R.id.Gratz);
        TextView point =this.findViewById(R.id.point);
        String numbeer= field.getText().toString();
<<<<<<< HEAD
        int nr = Integer.parseInt(numbeer);
        if (nr==number){
            gz.setText("Congratulations");

            points+=1;
            int score=points;
            point.setText("Points:"+ score );
=======
         int nr = Integer.parseInt(numbeer);
    if (nr==number){
        gz.setText("Congratulations");

        points+=1;
        int score=points;
        point.setText("Points:"+ score );

    }
    else {
        points+=0;
    }
>>>>>>> 85f5de8b9cf075197a93a0c59d9f25a5b5b6e558

        }
        else {
            points+=0;
            points=0;
        }


        tv.setText(Integer.toString(number));
    }



}