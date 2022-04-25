package com.ucv.sesion03;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cargando extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cargando);

        // Agregar animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView l_by = findViewById(R.id.l_by);
        TextView l_name = findViewById(R.id.l_autor);
        ImageView iv_logo = findViewById(R.id.iv_logo);

        l_by.setAnimation(animacion2);
        l_name.setAnimation(animacion2);
        iv_logo.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            private Intent intent;

            @Override
            public void run() {
                intent = new Intent(Cargando.this, Menu.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}
