package com.bawei.rerlian.presenter;

import com.bawei.rerlian.bace.BacePeresen;
import com.bawei.rerlian.contates.IContates;
import com.bawei.rerlian.model.ModelMvp;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 9:06
 * @Description:
 */
public class PresenterMvp extends BacePeresen {
    public ModelMvp modelMvp;

    @Override
    protected void initModel() {
         modelMvp=new ModelMvp();
    }

    @Override
    public void start(String url) {
       modelMvp.getInfo(url, new IContates.MyCallBack() {
           @Override
           public void onSuccess(String json) {
               getView().onSuccess(json);
           }

           @Override
           public void onErrorSuccess(String error) {
             getView().onErrorSuccess(error);
           }
       });
    }
}
