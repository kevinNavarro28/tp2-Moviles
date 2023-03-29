package com.example.tp2mobiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){

        ArrayAdapter<Inmueble> adapater = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv =findViewById(R.id.list);
        lv.setAdapter(adapater);
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa12,"Juana Koslay",80000));
        lista.add(new Inmueble(R.drawable.casa13,"Protrero de los Funes",50000));
        lista.add(new Inmueble(R.drawable.casa14,"El Trapiche",90000));
    }

}