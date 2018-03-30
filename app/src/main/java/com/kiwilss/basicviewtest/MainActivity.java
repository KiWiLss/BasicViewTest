package com.kiwilss.basicviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kiwilss.basicviewtest.basic.spinner.SpinnerTestActivity;
import com.kiwilss.basicviewtest.text.TextTestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spinnerListener(View view) {
        startActivity(new Intent(this, SpinnerTestActivity.class));
    }

    public void textListener(View view) {
        startActivity(new Intent(this, TextTestActivity.class));
    }
}
