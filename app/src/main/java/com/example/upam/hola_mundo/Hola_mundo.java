package com.example.upam.hola_mundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Hola_mundo extends AppCompatActivity {
    String msn="Mensaje";

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msn, "Metodo OnStop()");
        Toast.makeText(this," Metodo OnStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msn, "Metodo OnResume()");
        Toast.makeText(this," Metodo OnResume",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msn, "Metodo OnRestart()");
        Toast.makeText(this," Metodo OnRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msn, "Metodo OnStart()");
        Toast.makeText(this," Metodo OnStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msn, "Metodo OnPause()");
        Toast.makeText(this," Metodo OnPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msn, "Metodo OnDestroy()");
        Toast.makeText(this," Metodo OnDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Log.d(msn, "Hola a todos");
        Toast.makeText(this," Metodo Oncreate",Toast.LENGTH_SHORT).show();
    }

}
