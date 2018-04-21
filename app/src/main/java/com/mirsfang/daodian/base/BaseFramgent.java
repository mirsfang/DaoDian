package com.mirsfang.daodian.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/4/21.
 */

public class BaseFramgent extends Fragment {

    protected void initUI(View view){};

    protected void initData(){};


    /**
     * 跳转
     * @param activity
     */
    protected void RedorectActivity(Class activity){
        Intent intent = new Intent(getContext(),activity);
        startActivity(intent);
    }

    protected void RedorectActivity(Class activity, Bundle bundle){
        Intent intent = new Intent(getContext(),activity);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    //运行调度切换
    protected Observable conversionObservable(Observable observable){
        return observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
