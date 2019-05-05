package com.dyj.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG, "[MainActivity] [onCreate]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "[MainActivity] [onCreate]:" + savedInstanceState);
        if (savedInstanceState != null) {
            Log.d(TAG, "[MainActivity] [onCreate]:" + savedInstanceState.getString("key"));
        }
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "[MainActivity] [onStart]");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "[MainActivity] [onResume]");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "[MainActivity] [onPause]");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "[MainActivity] [onStop]");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "[MainActivity] [onDestroy]");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "[MainActivity] [onRestart]");
        super.onRestart();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "[MainActivity] [onSaveInstanceState] protected");
        outState.putString("key", "value");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "[MainActivity] [onRestoreInstanceState] protected value:" + savedInstanceState.getString("key"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DialogActivity.class);
        startActivity(intent);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setIcon(R.mipmap.ic_launcher)
//                .setTitle("测试弹框")
//                .setMessage("确定删除吗？")
//                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Log.d(TAG, "删除****************");
//                    }
//                })
//                .setNegativeButton("取消", null)
//                .show();


    }
}

