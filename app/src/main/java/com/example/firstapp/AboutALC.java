package com.example.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.

        //return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
