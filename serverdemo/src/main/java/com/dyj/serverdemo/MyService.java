package com.dyj.serverdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "dyj";

    private Handler mHandler = new Handler();

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
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("ok");
            }
        }, 10000);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.d(TAG, getClass().getSimpleName() + " onStart");
        super.onStart(intent, startId);
    }

    /**
     * 返回值研究（基于8.1）：
     * 在被异常杀死后,
     * START_STICKY、START_STICKY_COMPATIBILITY、START_REDELIVER_INTENT：以上3个返回值
     * 生命周期都是：onCreate-->onDestroy
     *
     * START_NOT_STICKY: 不执行任何方法
     *
     * 从现象来看，和官方文档描述不一致
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, getClass().getSimpleName() + " onStartCommand startId:" + startId);
        Log.d(TAG, getClass().getSimpleName() + " onStartCommand intent:" + intent);
        return Service.START_STICKY;
//        return Service.START_STICKY_COMPATIBILITY;
//        return Service.START_NOT_STICKY;
//        return Service.START_REDELIVER_INTENT;
    }


    @Override
    public void onDestroy() {
        Log.d(TAG, getClass().getSimpleName() + " onDestroy");
        super.onDestroy();
    }

}
