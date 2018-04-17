package com.kiwilss.basicviewtest.qrcode;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.utils.ZXingUtils;
import com.kiwilss.basicviewtest.R;

/**
 * FileName: QrcodeActivity
 *
 * @author : Lss kiwilss
 * e-mail : kiwilss@163.com
 * time   : 2018/4/12
 * desc   : ${DESCRIPTION}
 * Description: ${DESCRIPTION}
 */

public class QrcodeActivity extends AppCompatActivity {
    public static final String TAG = "MMM";

    private android.widget.ImageView mIvIcon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        this.mIvIcon = (ImageView) findViewById(R.id.iv_qr_code_icon);



    }

    public void scanCode(View view) {
        //获取权限

        Intent intent = new Intent(this, CaptureActivity.class);
        //是否显示相册按钮
        intent.putExtra(CaptureActivity.INTENT_KEY_PHOTO_FLAG, true);
        //识别声音
        intent.putExtra(CaptureActivity.INTENT_KEY_BEEP_FLAG, true);
        //识别震动
        intent.putExtra(CaptureActivity.INTENT_KEY_VIBRATE_FLAG, true);
        //扫码框的颜色
        intent.putExtra(CaptureActivity.INTENT_KEY_SCSNCOLOR, "#FFFF00");
        //扫码框上面的提示文案
        intent.putExtra(CaptureActivity.INTENT_KEY_HINTTEXT, "请将二维码放入框中....");
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            if (data == null) {
                return;
            }
            switch (resultCode) {
                case CaptureActivity.RESULT_SUCCESS:
                    String resultSuccess = data.getStringExtra(CaptureActivity.INTENT_KEY_RESULT_SUCCESS);
                    Log.e(TAG, "onActivityResult: "+resultSuccess );
                    break;
                case CaptureActivity.RESULT_FAIL:
                    String resultError = data.getStringExtra(CaptureActivity.INTENT_KEY_RESULT_ERROR);
                    Log.e(TAG, "onActivityResult: "+resultError );
                    break;
                case CaptureActivity.RESULT_CANCLE:
                    Log.e(TAG, "onActivityResult: 取消" );
                    break;
            }
        }
    }

    public void createPicNo(View view) {
        Bitmap bitmap = QRCodeUtil.createQRCodeBitmap("你好,世界!", 300);
        mIvIcon.setImageBitmap(bitmap);
    }

    public void createPicHeader(View view) {
        Bitmap bp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Bitmap bitmap = QRCodeUtil.createQRCodeBitmap("你好,万国!", 500, bp, 100);
        mIvIcon.setImageBitmap(bitmap);
    }

    public void createPicMore(View view) {
        //红色二维码,白色背景
        Bitmap bitmap = QRCodeUtil.createQRCodeBitmap("hello!boy", 400, Color.RED, Color.WHITE);
        mIvIcon.setImageBitmap(bitmap);
    }

    public void choicePicFromAlbum(View view) {

    }

    /**使用库的方法生成二维码
     * @param view
     */
    public void simpleQrcode(View view) {
        Bitmap qrImage = ZXingUtils.createQRImage("使用库的方法生成二维码");
        mIvIcon.setImageBitmap(qrImage);
    }

    public void simpleQrcodeLogo(View view) {
        Bitmap qrImage = ZXingUtils.createQRCodeWithLogo("使用库的方法生成带logo二维码",
                BitmapFactory.decodeResource(getResources(),R.mipmap.logo));
        mIvIcon.setImageBitmap(qrImage);
    }
}
