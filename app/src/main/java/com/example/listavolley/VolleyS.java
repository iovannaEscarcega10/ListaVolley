package com.example.listavolley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyS {
    private static VolleyS VolleyS = null;

    private RequestQueue mRequestQueue;

    //la clase singleton sirve para instanciar solo una vez
    private VolleyS(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
    }
    public static VolleyS getInstance(Context context){
        if ( VolleyS == null){
            VolleyS = new VolleyS(context);
        }
        return VolleyS;
    }
    public RequestQueue getmRequestQueue(){
        return mRequestQueue;
    }

}
