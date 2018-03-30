package com.kiwilss.basicviewtest.basic.spinner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.kiwilss.basicviewtest.R;

import org.angmarch.views.NiceSpinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: SpinnerTestActivity
 *
 * @author : Lss kiwilss
 *         e-mail : kiwilss@163.com
 *         time   : 2018/3/29
 *         desc   : ${DESCRIPTION}
 *         Description: ${DESCRIPTION}
 */

public class SpinnerTestActivity extends AppCompatActivity {
    private android.widget.Spinner spspinnertestsp;
    private Spinner mSpTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_test);
        this.mSpTwo = (Spinner) findViewById(R.id.sn_spinner_test_two);
        this.spspinnertestsp = (Spinner) findViewById(R.id.sp_spinner_test_sp);

        //监听选中项
        spspinnertestsp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] array = getResources().getStringArray(R.array.pinner);
                Toast.makeText(SpinnerTestActivity.this, array[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ArrayList<String> list = new ArrayList<>();
        list.add("安卓");
        list.add("安卓");
        list.add("安卓");
        list.add("安卓");
        list.add("安卓");
        SpinnerAdapter adapter = new SpinnerAdapter(this, list);
        mSpTwo.setAdapter(adapter);



        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);
        final List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        niceSpinner.attachDataSource(dataset);

        niceSpinner.addOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerTestActivity.this, dataset.get(i), Toast.LENGTH_SHORT).show();
                Log.e("MMM", "onItemClick: "+i+"||"+l);
            }
        });

        niceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("MMM", "onItemSelected: "+dataset.get(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
