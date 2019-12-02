package com.bawei.rerlian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.rerlian.bace.BaceActivity;
import com.bawei.rerlian.bace.BacePeresen;
import com.bawei.rerlian.presenter.PresenterMvp;

public class MainActivity extends BaceActivity {
           private  String url="http://172.17.8.100/small/commodity/v1/bannerShow";

    @Override
    protected void initData() {
         mPresenter.start(url);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected BacePeresen initPresenter() {
        return new PresenterMvp();
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccess(String json) {

    }

    @Override
    public void onErrorSuccess(String error) {

    }
}
