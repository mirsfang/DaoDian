package com.mirsfang.daodian.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Administrator on 2018/4/17.
 */

public abstract class BaseActivity extends AppCompatActivity {



    protected abstract void initUI();

    protected abstract void initData();

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

    //运行调度切换
    protected Observable conversionObservable(Observable observable){
        return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
