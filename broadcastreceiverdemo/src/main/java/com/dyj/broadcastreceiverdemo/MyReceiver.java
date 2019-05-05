package com.dyj.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by duanyuanjin
 * on 2019/5/5.
 */
public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "dyj";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, getClass().getSimpleName() + " onReceive");
    }
}
