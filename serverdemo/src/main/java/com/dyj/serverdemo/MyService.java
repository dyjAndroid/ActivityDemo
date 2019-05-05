package com.dyj.serverdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "dyj";

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, getClass().getSimpleName() + " onBind");
        return new Binder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, getClass().getSimpleName() + " onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d(TAG, getClass().getSimpleName() + " onRebind");
        super.onRebind(intent);
    }

    @Override
    public void onCreate() {
        Log.d(TAG, getClass().getSimpleName() + " onCreate");
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.d(TAG, getClass().getSimpleName() + " onStart");
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, getClass().getSimpleName() + " onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        Log.d(TAG, getClass().getSimpleName() + " onDestroy");
        super.onDestroy();
    }

}
