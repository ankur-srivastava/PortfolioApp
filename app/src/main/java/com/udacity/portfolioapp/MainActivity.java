package com.udacity.portfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
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

    public void spotify(View view){
        displayMessage("spotify");
    }

    public void scores(View view){
        displayMessage("scores");
    }

    public void library(View view){
        displayMessage("library");
    }

    public void bigger(View view){
        displayMessage("bigger");
    }

    public void xyz(View view){
        displayMessage("xyz");
    }

    public void capstone(View view){
        displayMessage("capstone");
    }

    public void displayMessage(String text){
        Toast.makeText(this, "This button will launch my "+text+" app!", Toast.LENGTH_SHORT).show();
    }
}