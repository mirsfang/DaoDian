package com.mirsfang.daodian.base;

import android.app.Application;
import android.support.annotation.Nullable;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


/**
 * Created by Administrator on 2018/4/13.
 */

public class DaoDianApplication extends Application {

    private static boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();


        Logger.addLogAdapter(new AndroidLogAdapter(){
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return isDebug;
            }
        });
    }
}
