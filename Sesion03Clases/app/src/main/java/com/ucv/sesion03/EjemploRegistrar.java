package com.ucv.sesion03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EjemploRegistrar extends AppCompatActivity {
    EditText varnombre;
    EditText varapel;
    EditText varcorreo;
    TextView varresp;
    Button bttnalert;

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_registrar);
        varnombre = (EditText) findViewById(R.id.edtNombre);
        varapel = (EditText) findViewById(R.id.edtApel);
        varcorreo = (EditText) findViewById(R.id.edtCorreo);
        varresp = (TextView) findViewById(R.id.tvResp);
        this.window = getWindow();
        bttnalert = (Button) findViewById(R.id.bttonMostar);
    }

    public void mostrar(View view) {
       /* String texto=varnombre.getText().toString()+
                " " + varapel.getText().toString()+
                " - " + varcorreo.getText().toString();
        varresp.setText(texto);*/
        if (!varnombre.getText().toString().isEmpty() || !varapel.getText().toString().isEmpty()
                || !varcorreo.getText().toString().isEmpty()
        ) {
            Intent intent = new Intent
                    (this, EjemploRecepcionar.class);
            Bundle obj = new Bundle();
            obj.putString("vnombre", varnombre.getText().toString());
            obj.putString("vapel", varapel.getText().toString());
            obj.putString("vcorreo", varcorreo.getText().toString());
            intent.putExtras(obj);
            startActivity(intent);
        } else {
            Toast.makeText(
                    this, "No puedes dejar los campos vacios", Toast.LENGTH_LONG).show();
            ico_alert();
            window.setNavigationBarColor(Color.parseColor("#CA3436"));
            window.setStatusBarColor(Color.parseColor("#CA3436"));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable
                    (Color.parseColor("#CA3436")));
            bttnalert.setBackgroundColor(Color.parseColor("#CA3436"));
        }
    }


    private void ico_alert() {
        varresp.setBackgroundResource(R.drawable.icoalert);
    }
}