package com.dyj.activitydemo;

import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "[DialogActivity] [onCreate]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "[DialogActivity] [onStart]");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "[DialogActivity] [onResume]");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "[DialogActivity] [onPause]");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "[DialogActivity] [onStop]");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "[DialogActivity] [onDestroy]");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "[DialogActivity] [onRestart]");
        super.onRestart();
    }
}
