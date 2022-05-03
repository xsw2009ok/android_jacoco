package com.songguo.qa.c.androidjacocotest.jacoco;

import com.orhanobut.logger.Logger;
import com.songguo.qa.c.androidjacocotest.MainActivity;
import com.songguo.qa.c.androidjacocotest.jacoco.FinishListener;

public class InstrumentedActivity extends MainActivity {
    public static String TAG = "InstrumentedActivity";

    private FinishListener mListener;

    public void setFinishListener(FinishListener listener) {
        mListener = listener;
    }


    @Override
    public void onDestroy() {

        Logger.i("测试log");
        super.finish();
        if (mListener != null) {
            mListener.onActivityFinished();
        }

        super.onDestroy();
    }



}