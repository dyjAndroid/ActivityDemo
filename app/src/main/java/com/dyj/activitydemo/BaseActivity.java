package com.dyj.activitydemo;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    protected static final String TAG = "dyj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Log.d(TAG, getClass().getSimpleName() + " onCreate taskId:" + getTaskId() +
                ",hashcode:" + this.hashCode() + ",taskAffinity:" + dumpyActivity());
    }

    private String dumpyActivity() {
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            return info.taskAffinity;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
