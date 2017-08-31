package com.bwie.licancan.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by robot on 2017/8/31.
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
