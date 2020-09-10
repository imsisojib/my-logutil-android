package com.imsisojib.logutil;

import android.util.Log;

public class MyLogs {
    public static final String TAG = "MY-LOGS";
    public static final String DATA_PERSISTENCE_ERROR = "DATA PERSISTENCE ERROR";

    public static void print(String message){
        Log.d(TAG,message);
    }

}
