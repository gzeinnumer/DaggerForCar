package com.gzeinnumer.daggerforcar.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "MYZEIN";
    @Inject
    public Remote(){
        Log.d(TAG, "Remote: Called");
    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: Remote Connect");
    }
}