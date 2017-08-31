package com.bwie.licancan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * 简答题:
 * 1.String不是基本数据类型  基本数据类型包括int double float  byte char long
 * 2.动画分为两类:补间动画和帧动画
 * 补间动画:可以实现页面中一些小控件的动画效果  使用起来简单方便
 * 帧动画:可以把一组图片变成一个看似是小视频的效果  效果更明显
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @ViewInject(R.id.click)  Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        //按钮的点击事件
        click.setOnTouchListener(this);

    }
    /**
     * 按钮的点击方法
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                //手指按下按钮  吐司提示
                Toast.makeText(MainActivity.this,"用户已按下按钮",Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                //手指已松开  取消点击
                Toast.makeText(MainActivity.this,"用户已松开",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
