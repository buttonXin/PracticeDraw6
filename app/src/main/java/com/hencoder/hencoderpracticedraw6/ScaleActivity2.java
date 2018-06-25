package com.hencoder.hencoderpracticedraw6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by oldhigh on 2018/6/25.
 */

public class ScaleActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView view = new TextView(this);
        view.setText("333333");
        view.setTextSize(33);
        setContentView(view);
    }
}
