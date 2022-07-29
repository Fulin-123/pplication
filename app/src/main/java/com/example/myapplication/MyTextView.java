package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
@SuppressLint("AppCompatCustomView")

public class MyTextView extends TextView{

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }
    // 始终返回true，即一直获得焦点
    @Override
    public boolean isFocused() {
        return true;
    }

}