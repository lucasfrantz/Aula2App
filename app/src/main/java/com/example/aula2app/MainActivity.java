package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "Ciclo de Vida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( TAG, "CREATE" );
        Intent intent = new Intent( this, ActivityTemperatura.class );
        startActivity( intent );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( TAG, "START" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( TAG, "RESUME" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( TAG, "PAUSE" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( TAG, "STOP" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( TAG, "DESTROY" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( TAG, "RESTART" );
    }
}