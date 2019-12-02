package com.bawei.rerlian.model;

import com.bawei.rerlian.contates.IContates;
import com.bawei.rerlian.net.NetVolley;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 9:05
 * @Description:
 */
public class ModelMvp implements IContates.Imodel {
    @Override
    public void getInfo(String url, final IContates.MyCallBack myCallBack) {
        NetVolley.getInstance().doGet(url, new NetVolley.MyCalllBack() {
            @Override
            public void onSuccess(String json) {
                 myCallBack.onSuccess(json);
            }

            @Override
            public void onErrorSuccess(String error) {
              myCallBack.onErrorSuccess(error);
            }
        });
    }
}
