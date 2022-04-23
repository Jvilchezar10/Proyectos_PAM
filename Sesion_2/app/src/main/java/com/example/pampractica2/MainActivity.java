package com.example.pampractica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    private ImageView btton_sig;
    private Button bttn_day, bttn_nightl;

    private Window window;

    private final String colorB_day = "#738b28", colorB_night = "#545454";
    private final String colorIV_day = "#738b28", colorIV_night = "#545454";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout) findViewById(R.id.Int1);
        btton_sig = (ImageView) findViewById(R.id.bttonsig);
        this.window = getWindow();

        bttn_nightl = (Button) findViewById(R.id.b_night);
        bttn_nightl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary = "#545454";
                String primaryDark = "#545454";

                cambiarcolor(primaryDark, primary);
                layout.setBackgroundResource(R.drawable.moonknight);
//                Button night
                bttn_nightl.setBackgroundColor(Color.parseColor(colorB_night));
//                Este es el imageView -> cambié el componente desde la interface
//                background por src (revisa el layout)
                btton_sig.setBackgroundColor(Color.parseColor(colorIV_night));
//                btton_sig.setBackgroundResource(R.drawable.<<image_import>>);
            }
        });

        bttn_day = (Button) findViewById(R.id.b_day);
        bttn_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary = "#C43E1C";
                String primaryDark = "#C43E1C";

                cambiarcolor(primaryDark, primary);
                layout.setBackgroundResource(R.drawable.day);
                //  Button day
                bttn_day.setBackgroundColor(Color.parseColor(colorB_day));
                btton_sig.setBackgroundColor(Color.parseColor(colorIV_day));
                //  btton_sig.setBackgroundResource(R.drawable.<<image_import>>);
            }
        });
    }

    private void cambiarcolor(String primaryDark, String primary) {
        //barra de color
        window.setStatusBarColor(Color.parseColor(primaryDark));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));
        //barra de navegación
        window.setNavigationBarColor(Color.parseColor(primary));

    }

    public void btton_sig(View view) {

    }
}