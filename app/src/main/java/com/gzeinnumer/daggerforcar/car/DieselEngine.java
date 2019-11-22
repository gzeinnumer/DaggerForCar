package com.gzeinnumer.daggerforcar.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "MYZEIN";

    @Inject
    public DieselEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "start: called diesel");
    }
}
