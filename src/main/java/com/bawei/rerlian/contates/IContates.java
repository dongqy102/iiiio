package com.bawei.rerlian.contates;

import com.bawei.rerlian.app.MyApp;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 8:54
 * @Description:
 */
public interface IContates {
    interface MyCallBack{
        void  onSuccess(String json);
        void  onErrorSuccess(String error);
    }
    interface  Imodel{
        void  getInfo(String url, MyCallBack myCallBack);
    }
     interface Iview{
         void  onSuccess(String json);
         void  onErrorSuccess(String error);
    }
    interface  Ipresenter{
        void  start(String url);
    }

}
