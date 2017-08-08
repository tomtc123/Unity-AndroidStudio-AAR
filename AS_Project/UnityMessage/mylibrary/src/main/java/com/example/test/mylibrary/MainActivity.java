package com.example.test.mylibrary;

import android.app.AlertDialog;
import android.os.Bundle;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public String ShowDialog(final String _title, final String _content){

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(_title).setMessage(_content).setPositiveButton("确定", null).setNegativeButton("取消", null);
                builder.show();
            }
        });

        return BuildConfig.API_HOST;
    }



}
