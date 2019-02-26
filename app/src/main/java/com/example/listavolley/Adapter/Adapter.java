package com.example.listavolley.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listavolley.Persona;
import com.example.listavolley.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {

    Context context;
    List<Persona> lista;


    public Adapter(Context context,List<Persona> lista){
        this.context=context;
        this.lista=lista;
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =  LayoutInflater.from(context).inflate(R.layout.itemdesign,null);

        Persona ci = (Persona) getItem(position);

        TextView nombre = convertView.findViewById(R.id.txtnom);
        TextView apellidos = convertView.findViewById(R.id.apellidos2);
        TextView edad = convertView.findViewById(R.id.edad2);

        nombre.setText(ci.getNombre());
        apellidos.setText(ci.getApellido());
        edad.setText(String.valueOf(ci.getEdad()));
        return convertView;
    }
}
