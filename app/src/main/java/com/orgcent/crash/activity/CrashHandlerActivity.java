package com.orgcent.crash.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.orgcent.crash.CrashHandler;
import com.orgcent.crash.R;
/**
 * 作者：earl on 16/04/23 00:55
 * 邮箱：z604458675@gmail.com
 * 描述：CrashHandlerActivity
 */
public class CrashHandlerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);

    }
    public void onClick(View view){
        startActivity(new Intent().setClass(this,TestActivity.class));
    }
}