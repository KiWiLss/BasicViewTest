package com.kiwilss.basicviewtest.basic.edittext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.kiwilss.basicviewtest.R;

/**
 * FileName: EtKeyboardFgActivity
 *
 * @author : Lss kiwilss
 *         e-mail : kiwilss@163.com
 *         time   : 2018/4/9
 *         desc   : ${DESCRIPTION}
 *         Description: ${DESCRIPTION}
 */

public class EtKeyboardFgActivity extends AppCompatActivity {
    private android.widget.FrameLayout mFl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et_keyboard);
        this.mFl = (FrameLayout) findViewById(R.id.fl_et_keyboard_fl);

        FragmentManager fm = getSupportFragmentManager();
        @SuppressLint("CommitTransaction")
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.fl_et_keyboard_fl,new EtFragment()).commit();
    }
}
