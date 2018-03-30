package com.kiwilss.basicviewtest.text;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;

import com.kiwilss.basicviewtest.R;

/**
 * FileName: TextTestActivity
 *
 * @author : Lss kiwilss
 *         e-mail : kiwilss@163.com
 *         time   : 2018/3/29
 *         desc   : ${DESCRIPTION}
 *         Description: ${DESCRIPTION}
 */

public class TextTestActivity extends AppCompatActivity {


    private android.widget.TextView tvtext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_test);
        this.tvtext = (TextView) findViewById(R.id.tv_text);


        String msg = "<p style=\"text-align: center;\">&nbsp;施工2 施工3" +
                "<img src=\"https://xzw-image.oss-cn-zhangjiakou.aliyuncs.com/homeOrder/ueditor/473dd0f942664593942d9023665d7d07.png\" " +
                "title=\"\" alt=\"473dd0f942664593942d9023665d7d07.png.png\" width=\"312\" height=\"281\"/>" +
                "安德森打算的权威请问饿电风扇地方斯蒂芬速度瑞琪儿请问11111111111111111111QQQQQQQQQQQQQQQQQQQQQQQ!@#!@#!%#$%%$&amp;@#!@^*%^#!@$q%$y^w$t dxgds&nbsp;</p>";

        Spanned spanned = Html.fromHtml(msg);
        Log.e("MMM", "onCreate: "+spanned );
        tvtext.setText(Html.fromHtml(msg));
    }


}
