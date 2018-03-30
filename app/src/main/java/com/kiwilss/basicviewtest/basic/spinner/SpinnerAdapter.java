package com.kiwilss.basicviewtest.basic.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kiwilss.basicviewtest.R;

import java.util.List;

/**
 * FileName: SpinnerAdapter
 *
 * @author : Lss kiwilss
 *         e-mail : kiwilss@163.com
 *         time   : 2018/3/29
 *         desc   : ${DESCRIPTION}
 *         Description: ${DESCRIPTION}
 */

public class SpinnerAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private Context mContext;
    private List<String>mData;

    public SpinnerAdapter(Context context, List<String> data) {
        mContext = context;
        mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view=mInflater.inflate(R.layout.item_spinner,viewGroup,false);
        }
        TextView tv = view.findViewById(R.id.tv_item_spinner_text);
        tv.setText(mData.get(i));
        return view;
    }
}
