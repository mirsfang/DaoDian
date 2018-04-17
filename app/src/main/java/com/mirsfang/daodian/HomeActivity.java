package com.mirsfang.daodian;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.mirsfang.daodian.base.BaseActivity;
import com.yinglan.alphatabs.AlphaTabsIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.content)
    FrameLayout content;
    @BindView(R.id.home_bottom_tab)
    AlphaTabsIndicator homeBottomTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }
}
