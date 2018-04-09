package com.kiwilss.basicviewtest.basic.edittext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kiwilss.basicviewtest.R;

/**
 * FileName: EtFragment
 *
 * @author : Lss kiwilss
 *         e-mail : kiwilss@163.com
 *         time   : 2018/4/9
 *         desc   : ${DESCRIPTION}
 *         Description: ${DESCRIPTION}
 */

public class EtFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_et_keyboard, container, false);

        return view;
    }
}
