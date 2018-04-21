package com.mirsfang.daodian.activity

import android.os.Bundle
import android.text.TextUtils
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import com.blankj.utilcode.util.*
import com.google.gson.Gson
import com.mirsfang.daodian.R
import com.mirsfang.daodian.base.BaseActivity
import com.mirsfang.daodian.entitis.LoginEntity
import com.mirsfang.daodian.network.NetWorkManager
import com.mirsfang.daodian.network.NetWorkObserver
import com.orhanobut.logger.Logger

import kotlinx.android.synthetic.main.activity_login.*

/**
 * 登录页面
 */
class LoginActivity : BaseActivity() ,View.OnClickListener,View.OnFocusChangeListener {


    protected var mShowPwd = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initUI()
        initData()
    }

    override fun initUI() {
        ivSwitchPWDVisible.setOnClickListener(this)
        btnLogin.setOnClickListener(this)

        editUserName.onFocusChangeListener = this
        editPassWord.onFocusChangeListener = this
    }

    override fun initData() {
    }

    override fun onClick(v: View?) {
       when(v!!.id){
           ivSwitchPWDVisible.id->{
               if(!mShowPwd) {
                   editPassWord.transformationMethod = HideReturnsTransformationMethod.getInstance()
                   mShowPwd = true
               }else{
                   editPassWord.transformationMethod = PasswordTransformationMethod.getInstance()
                   mShowPwd = false
               }
           }

           btnLogin.id ->{
               togoLogin()
           }
       }
    }


    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        if(!hasFocus){
            KeyboardUtils.hideSoftInput(v)
        }
    }

    fun togoLogin(){

        if(TextUtils.isEmpty(editUserName.text.toString())){
            ToastUtils.showShort("用户名不能为空!")
            return
        }

        if(TextUtils.isEmpty(editPassWord.text.toString())){
            ToastUtils.showShort("密码不能为空!")
            return
        }

       conversionObservable(NetWorkManager.getInstance()
               .httpReuset
               .login("13462824115","123456"))
               .subscribe(object : NetWorkObserver<LoginEntity>() {
                   override fun onNext(t: LoginEntity) {
                       if( t.success <= 0 ){
                            ToastUtils.showShort(t.msg)
                            tvMsg.setText(t.msg)
                            tvMsg.visibility = View.VISIBLE
                            return
                       }

                       //缓存对象
                       var jsonKey = Gson().toJson(t)
                       SPUtils.getInstance().put(LoginEntity.KEY,jsonKey)

                       gotoMainActivity()
                   }

                   override fun onError(e: Throwable) {
                       Logger.e(e.message+"")

                   }
               })
    }

    fun gotoMainActivity(){
        RedorectActivity(HomeActivity::class.java)
    }

}

