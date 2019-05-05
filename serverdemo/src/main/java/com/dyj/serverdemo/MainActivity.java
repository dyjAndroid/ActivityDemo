package com.dyj.serverdemo;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "dyj";

    private Intent mIntent;

    private MyServiceConnection mMyServiceConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntent = new Intent(this, MyService.class);
        mMyServiceConnection = new MyServiceConnection();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_server:
                startService(mIntent);
                break;
            case R.id.stop_service:
                stopService(mIntent);
                break;
            case R.id.bind_service:
                bindService(mIntent, mMyServiceConnection, Service.BIND_AUTO_CREATE);
                break;
            case R.id.unbind_service:
                unbindService(mMyServiceConnection);
                break;
        }

    }

    private static class MyServiceConnection implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(TAG, getClass().getSimpleName() + "onServiceConnected");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, getClass().getSimpleName() + "onServiceDisconnected");
        }
    }
}
