package com.dyj.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyReceiver mMyReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction("com.dyj.test.broadcast");
//        mMyReceiver = new MyReceiver();
//        registerReceiver(mMyReceiver, intentFilter);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.but_send:
                Intent intent = new Intent("com.dyj.test.broadcast");
                sendBroadcast(intent);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(mMyReceiver);
    }
}
