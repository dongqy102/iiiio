package com.bawei.rerlian.bace;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bawei.rerlian.contates.IContates;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 9:01
 * @Description:
 */
public abstract class BaceActivity <P extends BacePeresen> extends AppCompatActivity implements IContates.Iview {
  public  P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(provideLayoutId()!=0){
             setContentView(provideLayoutId());
           mPresenter=initPresenter();
            if (mPresenter != null) {
                mPresenter.attch(this);
            }
            initView();
           initData();

        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.deAttch();
            mPresenter=null;
        }
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P initPresenter();

    protected abstract int provideLayoutId();
}
