package com.mirsfang.daodian;

import android.os.Bundle;


import com.mirsfang.daodian.base.BaseActivity;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Observable.interval(0, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                if(aLong == 3){
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
}
