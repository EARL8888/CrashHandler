package com.orgcent.crash.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.orgcent.crash.R;

/**
 * 作者：earl on 16/04/23 00:55
 * 邮箱：z604458675@gmail.com
 * 描述：CrashHandler
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }

    public void onClick(View view) {
        // 创建错误
        throw new NullPointerException();
    }
}
