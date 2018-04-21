package com.mirsfang.daodian;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.mirsfang.daodian.base.BaseActivity;
import com.mirsfang.daodian.fragment.JinDianFragment;
import com.mirsfang.daodian.fragment.KeHuFragment;
import com.mirsfang.daodian.fragment.WoDeFragment;
import com.mirsfang.daodian.fragment.YingYongFragment;
import com.yinglan.alphatabs.AlphaTabsIndicator;
import com.yinglan.alphatabs.OnTabChangedListner;

import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements OnTabChangedListner{

    @BindView(R.id.content)
    FrameLayout content;
    @BindView(R.id.home_bottom_tab)
    AlphaTabsIndicator homeBottomTab;

    private JinDianFragment mJinDianFragment;
    private KeHuFragment mKeHuFragment;
    private WoDeFragment mWoDeFramgent;
    private YingYongFragment mYingYongFramgent;

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        initUI();
        initData();

    }

    @Override
    public void onTabSelected(int tabNum) {
        setTabSelection(tabNum);
    }

    @Override
    protected void initUI() {
        homeBottomTab.setOnTabChangedListner(this);

        fragmentManager = getSupportFragmentManager();
        setTabSelection(0);

    }

    @Override
    protected void initData() {

    }



    private void setTabSelection(int index)
    {

        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);

        switch (index) {
            case 0:
                // 当点击了消息tab时，改变控件的图片和文字颜色
                if (mJinDianFragment == null) {
                    // 如果MessageFragment为空，则创建一个并添加到界面上
                    mJinDianFragment = new JinDianFragment();
                    transaction.add(R.id.content, mJinDianFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(mJinDianFragment);
                }
                break;
            case 1:
                if (mKeHuFragment == null) {
                    mKeHuFragment = new KeHuFragment();
                    transaction.add(R.id.content, mKeHuFragment);
                } else {
                    transaction.show(mKeHuFragment);
                }
                break;
            case 2:
                if (mYingYongFramgent == null) {
                    mYingYongFramgent = new YingYongFragment();
                    transaction.add(R.id.content, mYingYongFramgent);
                } else {
                    transaction.show(mYingYongFramgent);
                }
                break;
            case 3:
                if (mWoDeFramgent == null) {
                    mWoDeFramgent = new WoDeFragment();
                    transaction.add(R.id.content, mWoDeFramgent);
                } else {
                    transaction.show(mWoDeFramgent);
                }
                break;
        }

        transaction.commit();
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     * 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction)
    {
        if (mJinDianFragment != null)
        {
            transaction.hide(mJinDianFragment);
        }
        if (mKeHuFragment != null)
        {
            transaction.hide(mKeHuFragment);
        }
        if (mYingYongFramgent != null)
        {
            transaction.hide(mYingYongFramgent);
        }
        if (mWoDeFramgent != null)
        {
            transaction.hide(mWoDeFramgent);
        }
    }
}
