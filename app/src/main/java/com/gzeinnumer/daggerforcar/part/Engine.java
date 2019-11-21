package com.gzeinnumer.daggerforcar.part;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    private static final String TAG = "MYZEIN";

    //todo 2
    @Inject
    public Engine(){
        Log.d(TAG, "Engine: Called");
    }
}
