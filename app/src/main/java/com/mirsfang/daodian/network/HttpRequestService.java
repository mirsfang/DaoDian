package com.mirsfang.daodian.network;


import com.mirsfang.daodian.entitis.LoginEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 请求管理类
 * Created by Administrator on 2018/4/21.
 */

public interface HttpRequestService {

    @FormUrlEncoded
    @POST("sys/sooid/login")
    Observable<LoginEntity> login(
            @Field("username") String userId,
            @Field("password") String password
    );


}
