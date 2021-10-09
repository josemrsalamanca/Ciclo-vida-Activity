package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Estoy en la función onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        guardarLog("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        guardarLog("onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        guardarLog("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        guardarLog("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        guardarLog("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        guardarLog("onRestart");
    }

    private void guardarLog(String nombreFuncion){
        Log.d(TAG,"Estoy en la función "+nombreFuncion);
    }
}