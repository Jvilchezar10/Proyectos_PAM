package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.ucv.sesion03.Adapter.AdapterNegocio;
import com.ucv.sesion03.Clases.Negocio;

import java.util.ArrayList;

public class EjemploGrid extends AppCompatActivity {
    private GridView vargrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_grid);
        vargrid= (GridView) findViewById(R.id.gvaobj1);
        ArrayList<Negocio> valores = new ArrayList<>();
        valores.add(new Negocio
                ("Maria",R.drawable.a01,R.drawable.b01));
        valores.add(new Negocio
                ("Juan",R.drawable.a02,R.drawable.b02));
        valores.add(new Negocio
                ("Carlos",R.drawable.a03,R.drawable.b03));
        valores.add(new Negocio
                ("Linda",R.drawable.a04,R.drawable.b04));
        AdapterNegocio adapter= new
                AdapterNegocio(this,valores);
        vargrid.setAdapter(adapter);
    }
}