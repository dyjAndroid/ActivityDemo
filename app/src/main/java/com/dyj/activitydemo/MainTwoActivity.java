package com.dyj.activitydemo;

import android.os.Bundle;
import android.util.Log;

public class MainTwoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "[MainTwoActivity] [onCreate]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "[MainTwoActivity] [onStart]");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "[MainTwoActivity] [onResume]");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "[MainTwoActivity] [onPause]");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "[MainTwoActivity] [onStop]");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "[MainTwoActivity] [onDestroy]");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "[MainTwoActivity] [onRestart]");
        super.onRestart();
    }
}
