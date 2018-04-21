package com.mirsfang.daodian.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mirsfang.daodian.R;
import com.mirsfang.daodian.activity.LoginActivity;
import com.mirsfang.daodian.base.BaseFramgent;

/**
 * A simple {@link Fragment} subclass.
 */
public class JinDianFragment extends BaseFramgent {


    public JinDianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jin_dian, container, false);


        initUI(view);
        initData();

        return view;
    }


    @Override
    protected void initUI(View view) {
        super.initUI(view);

        view.findViewById(R.id.textBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RedorectActivity(LoginActivity.class);
            }
        });

    }

    @Override
    protected void initData() {
        super.initData();
    }
}
