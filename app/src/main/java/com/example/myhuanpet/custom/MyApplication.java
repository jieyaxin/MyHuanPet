package com.example.myhuanpet.custom;

import android.app.Application;

/**
 * Created by 解亚鑫 on 2017/12/6.
 */

public class MyApplication extends Application {
    public static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
