package com.example.todosample;

import android.app.Application;

import com.example.todosample.logic.local.AppDataBaseProvider;
import com.facebook.stetho.Stetho;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRoom();
        initSteho();
    }

    private void initSteho() {
        Stetho.initializeWithDefaults(this);
    }

    private void initRoom() {
        // 1회 생성
        AppDataBaseProvider.getINSTANCE(getApplicationContext());
    }
}
