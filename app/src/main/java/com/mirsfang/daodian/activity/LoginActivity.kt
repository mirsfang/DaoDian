package com.mirsfang.daodian.activity

import android.os.Bundle
import com.blankj.utilcode.util.CacheUtils
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.SPUtils
import com.blankj.utilcode.util.ToastUtils
import com.google.gson.Gson
import com.mirsfang.daodian.R
import com.mirsfang.daodian.base.BaseActivity
import com.mirsfang.daodian.entitis.LoginEntity
import com.mirsfang.daodian.network.NetWorkManager
import com.mirsfang.daodian.network.NetWorkObserver
import com.orhanobut.logger.Logger
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import kotlinx.android.synthetic.main.activity_login.*

/**
 * 登录页面
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initUI()
        initData()
    }

    override fun initUI() {

    }

    override fun initData() {
    }


    fun togoLogin(){
       conversionObservable(NetWorkManager.getInstance()
               .httpReuset
               .login("13462824115","123456"))
               .subscribe(object : NetWorkObserver<LoginEntity>() {
                   override fun onNext(t: LoginEntity) {
                       if( t.success <= 0 ){
                            ToastUtils.showShort(t.msg)
                            return
                       }

                       //缓存对象
                       var  jsonKey = Gson().toJson(t)
                       SPUtils.getInstance().put(LoginEntity.KEY,jsonKey)

                       gotoMainActivity()
                   }

                   override fun onError(e: Throwable) {
                       Logger.e(e.message+"")

                   }
               })
    }

    fun gotoMainActivity(){
        RedorectActivity(MainActivity::class.java)
    }

}

