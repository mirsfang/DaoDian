package com.mirsfang.daodian.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/4/17.
 */

public class BaseActivity extends AppCompatActivity {


    /**
     * 跳转
     * @param activity
     */
    protected void RedorectActivity(Class activity){
        Intent intent = new Intent(this,activity);
        startActivity(intent);
    }

    protected void RedorectActivity(Class activity, Bundle bundle){
        Intent intent = new Intent(this,activity);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
