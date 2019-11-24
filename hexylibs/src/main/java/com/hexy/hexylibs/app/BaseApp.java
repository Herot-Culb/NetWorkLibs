package com.hexy.hexylibs.app;

import android.app.Application;

import com.hjq.toast.ToastUtils;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
