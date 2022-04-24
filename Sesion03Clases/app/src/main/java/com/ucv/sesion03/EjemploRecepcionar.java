package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EjemploRecepcionar extends AppCompatActivity {
        TextView var1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_recepcionar);
        var1 = (TextView) findViewById(R.id.tvDatos);
        Intent obt= getIntent();
        Bundle datos=obt.getExtras();
         String texto=datos.getString("vnombre")+
                " " + datos.getString("vapel")+
                " - " + datos.getString("vcorreo");
        var1.setText(texto);
    }
}