package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void irRegistrar(View view){
        Intent intent = new Intent
                (this,EjemploRegistrar.class);
        startActivity(intent);
    }
    public void irSpinner(View view){
        Intent intent = new Intent
                (this,EjemploSpinner.class);
        startActivity(intent);
    }
    public void irGrid(View view){
        Intent intent = new Intent
                (this,EjemploGrid.class);
        startActivity(intent);
    }
}