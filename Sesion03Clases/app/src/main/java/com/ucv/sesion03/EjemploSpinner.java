package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EjemploSpinner extends AppCompatActivity {
    Spinner varsp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_spinner);
        varsp= (Spinner) findViewById(R.id.splistado);
        String [] opciones =
                {"Ingeniero","Medico","Abogado","Contador"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this,R.layout.item_spinner,opciones);
        varsp.setAdapter(adapter);

    }

}