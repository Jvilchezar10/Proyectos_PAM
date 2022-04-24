package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EjemploRegistrar extends AppCompatActivity {
    EditText varnombre;
    EditText varapel;
    EditText varcorreo;
    TextView varresp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_registrar);
        varnombre = (EditText) findViewById(R.id.edtNombre);
        varapel = (EditText) findViewById(R.id.edtApel);
        varcorreo = (EditText) findViewById(R.id.edtCorreo);
        varresp = (TextView) findViewById(R.id.tvResp);
    }
    public void mostrar(View view){
       /* String texto=varnombre.getText().toString()+
                " " + varapel.getText().toString()+
                " - " + varcorreo.getText().toString();
        varresp.setText(texto);*/
        Intent intent = new Intent
                (this,EjemploRecepcionar.class);
        Bundle obj = new Bundle();
        obj.putString("vnombre",varnombre.getText().toString());
        obj.putString("vapel",varapel.getText().toString());
        obj.putString("vcorreo",varcorreo.getText().toString());
        intent.putExtras(obj);
        startActivity(intent);
    }
}