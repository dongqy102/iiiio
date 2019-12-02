package com.bawei.rerlian.app;

import android.app.Application;
import android.content.Context;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 8:47
 * @Description:
 */
public class MyApp extends Application {
    public  static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
