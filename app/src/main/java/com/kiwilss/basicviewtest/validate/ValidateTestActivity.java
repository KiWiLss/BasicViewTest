package com.kiwilss.basicviewtest.validate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.kiwilss.basicviewtest.R;

import cn.yhq.validate.ValidateManager;

/**
 * FileName: ValidateTestActivity
 *
 * @author : Lss kiwilss
 * e-mail : kiwilss@163.com
 * time   : 2018/4/18
 * desc   : ${DESCRIPTION}
 * Description: ${DESCRIPTION}
 */
public class ValidateTestActivity extends AppCompatActivity {
    public static final String TAG = "MMM";
    private EditText etphone;
    private EditText etlenth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_test);
        this.etlenth = (EditText) findViewById(R.id.et_lenth);
        this.etphone = (EditText) findViewById(R.id.et_phone);


    }

    public void validateListener(View view) {
        String phone = etphone.getText().toString();
        boolean isPhone = ValidateManager.isPhone(phone);
        Log.e(TAG, "validateListener: "+isPhone);

        ValidateManager validateManager = new ValidateManager();
        validateManager.addValidatePhoneItem(etphone, "输入正确的手机号");
        if (validateManager.validate()){
            Log.e(TAG, "validateListener: 验证通过" );
        }
    }
}
