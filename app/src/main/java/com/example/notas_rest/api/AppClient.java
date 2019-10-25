package com.example.notas_rest.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppClient {
//    NODE JS
//    private static final String BASE_URL = "http://192.168.1.61:3000/";
//    PYTHON
//    private static final String BASE_URL = "http://192.168.1.61:5000/";
//    PHP
    private static final String BASE_URL = "http://192.168.1.61/php_rest_note/";
    private static Retrofit retrofit;



    public static Retrofit getApiClient(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
