package com.example.test;

import android.app.Application;

import com.backendless.Backendless;

public class BackendApplication extends Application {


    public static final String APPLICATION_ID = "3804C06C-75FD-BC30-FF0C-7290FB7F7700";
    public static final String API_KEY = "9210586B-839D-C8BE-FFA4-D307AF636B00";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);

    }
}
