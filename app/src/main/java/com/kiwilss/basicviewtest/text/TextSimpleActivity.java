package com.kiwilss.basicviewtest.text;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;

import com.kiwilss.basicviewtest.R;

/**
 * FileName: TextSimpleActivity
 *
 * @author : Lss kiwilss
 * e-mail : kiwilss@163.com
 * time   : 2018/4/18
 * desc   : ${DESCRIPTION}
 * Description: ${DESCRIPTION}
 */
public class TextSimpleActivity extends AppCompatActivity {
    private TextView mTvFore;

    private TextView mTvSize;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_simple);
        mTvSize = (TextView) findViewById(R.id.tv_text_simple_size);
        mTvFore = (TextView) findViewById(R.id.tv_text_simple_fore);

        //部分文字前景色
        //1,获取全部文字
        String srcString = mTvFore.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(srcString);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.RED),
                2, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.YELLOW),
                1, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //改变部分文字的背景色
        spannableStringBuilder.setSpan(new BackgroundColorSpan(Color.GREEN)
                , 4, 6, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTvFore.setText(spannableStringBuilder);

        //修改部分文字的大小
        String sizeString = mTvSize.getText().toString();
        SpannableString sizeSpan = new SpannableString(sizeString);
        //1.5f修改文字的倍数
        sizeSpan.setSpan(new RelativeSizeSpan(1.5f),1,2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sizeSpan.setSpan(new ForegroundColorSpan(Color.RED), 2, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTvSize.setText(sizeSpan);
    }
}
