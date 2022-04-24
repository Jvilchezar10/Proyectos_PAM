package com.ucv.sesion03.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ucv.sesion03.Modelo.Negocio;
import com.ucv.sesion03.R;

import java.util.ArrayList;

public class AdapterNegocio extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Negocio> arreglo;

    public AdapterNegocio(Context context,
                          ArrayList<Negocio> arreglo) {
        this.context = context;
        this.arreglo = arreglo;
    }


    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return arreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater)
                    context.getSystemService
                            (Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null) {
            view = inflater.inflate(R.layout.item_grid,
                    null);
        }
        ImageView varfotouser = (ImageView) view.findViewById(R.id.imagenUser);
        ImageView varfotolocal = (ImageView) view.findViewById(R.id.imagenNeg);
        TextView txtuser = (TextView) view.findViewById(R.id.tvUser);
       varfotouser.setImageResource(arreglo.get(i).getFoto());
        varfotolocal.setImageResource(arreglo.get(i).getFotolocal());
        txtuser.setText(arreglo.get(i).getNombre());
        return view;

    }
}
