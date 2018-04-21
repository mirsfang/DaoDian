package com.mirsfang.daodian.activity;

import android.os.Bundle;


import com.mirsfang.daodian.R;
import com.mirsfang.daodian.base.BaseActivity;
import com.orhanobut.logger.Logger;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainActivity extends BaseActivity {

    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        disposable = Observable.interval(0, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                if(aLong == 3){
//                    Logger.e(aLong+"");
                    RedorectActivity(HomeActivity.class);
                    finish();
                }
            }
        });

    }


    @Override
    protected void initUI() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(!disposable.isDisposed()) disposable.dispose();
    }
}
