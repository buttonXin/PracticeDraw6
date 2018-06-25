package com.hencoder.hencoderpracticedraw6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 进行扩散的控件
 *
 * @author oldhigh
 * @date 2018/6/25
 */

public class ScaleActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_scale1);
        Button view = (Button) findViewById(R.id.btn_scale);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scale(v);
            }
        });
    }

    private void scale(final View view) {
        view.animate()
                .scaleX(10)
                .scaleY(10)
                .setDuration(500)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {

                        startActivity(new Intent(getApplicationContext(), ScaleActivity2.class));

                        view.animate()
                                .scaleY(1)
                                .scaleX(1)
                                .setDuration(500)
                                .setListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {

                                        view.animate().cancel();
                                    }
                                });

                    }
                });
    }

}
