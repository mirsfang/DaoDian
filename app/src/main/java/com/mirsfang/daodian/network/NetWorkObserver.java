package com.mirsfang.daodian.network;


import com.blankj.utilcode.util.LogUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 网络大回调
 * Created by Administrator on 2018/4/21.
 */

public class NetWorkObserver<T> implements Observer<T> {
    private Disposable mDisposable;
    @Override
    public void onSubscribe(Disposable d) {
        mDisposable = d;
    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        LogUtils.e(e);
        if(!mDisposable.isDisposed()){
            mDisposable.dispose();
        }
    }

    @Override
    public void onComplete() {
        if(!mDisposable.isDisposed()){
            mDisposable.dispose();
        }
    }
}
