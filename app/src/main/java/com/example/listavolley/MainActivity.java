package com.example.listavolley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.listavolley.Adapter.Adapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lista;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        btn= findViewById(R.id.btn1);

    }



    public void click_boton(View view) {

        //un listener para recibir la respuesta
        JsonArrayRequest jor = new JsonArrayRequest(Request.Method.GET, "http://nuevo.rnrsiilge-org.mx/lista", null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            //el Gson se usa para convertir
                            Gson g=new Gson(); //trae la información en un jsonArray
                            //el gson necesita un array, un tipo de dato etc..

                            //Con el token se saca el tipo de dato y convertirlo de jsonArray a lista de personas
                            Type t = new TypeToken<List<Persona>>(){}.getType();

                            List<Persona> lp = g.fromJson(response.toString(),t);


                            Adapter adapter = new Adapter(getApplicationContext(),lp);
                            lista.setAdapter(adapter);

                           // Log.d("Listaa",response.toString());


                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        VolleyS.getInstance(this).getmRequestQueue().add(jor);

    }
}
