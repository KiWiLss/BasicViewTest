package com.kiwilss.basicviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kiwilss.basicviewtest.basic.edittext.EdittextKeyboard;
import com.kiwilss.basicviewtest.basic.edittext.EtKeyboardFgActivity;
import com.kiwilss.basicviewtest.basic.spinner.SpinnerTestActivity;
import com.kiwilss.basicviewtest.qrcode.QrcodeActivity;
import com.kiwilss.basicviewtest.text.TextSimpleActivity;
import com.kiwilss.basicviewtest.text.TextTestActivity;
import com.kiwilss.basicviewtest.validate.ValidateTestActivity;

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

    public void edittextkeyborad(View view) {
        startActivity(new Intent(this, EdittextKeyboard.class));
    }

    public void edittextkeyboradFg(View view) {
        startActivity(new Intent(this, EtKeyboardFgActivity.class));
    }

    public void qrcodeListener(View view) {
        startActivity(new Intent(this, QrcodeActivity.class));
    }

    public void validateListener(View view) {
        startActivity(new Intent(this, ValidateTestActivity.class));
    }

    public void textviewSimpleListener(View view) {
        startActivity(new Intent(this, TextSimpleActivity.class));
    }
}
