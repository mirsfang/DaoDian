package com.mirsfang.daodian.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/4/21.
 */

public class NetWorkManager {
    private volatile static NetWorkManager mInsatance;
    private Retrofit mRetrofit;

    private NetWorkManager(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(HttpUrl.getUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static NetWorkManager getInstance(){
        if(mInsatance == null){
            synchronized (NetWorkManager.class){
                if(mInsatance == null){
                    mInsatance = new NetWorkManager();
                }
            }
        }
        return mInsatance;
    }

    /**
     * 获取HttpRequestService
     * @return
     */
    public HttpRequestService getHttpReuset(){
        return mRetrofit.create(HttpRequestService.class);
    }
}
