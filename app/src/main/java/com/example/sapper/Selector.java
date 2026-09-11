package com.example.sapper;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class Selector extends LinearLayout {

    public Selector(Context context) {
        this(context, null);
    }

    public Selector(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Selector(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public Selector(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);


    }
}
