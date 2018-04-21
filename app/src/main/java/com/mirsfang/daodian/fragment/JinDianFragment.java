package com.mirsfang.daodian.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mirsfang.daodian.R;
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

        return inflater.inflate(R.layout.fragment_jin_dian, container, false);
    }

}
