package com.gzeinnumer.daggerforcar.car;

import android.util.Log;

import javax.inject.Inject;

public interface Engine {
    String TAG = "MYZEIN";

    //todo 2
//    @Inject
//    public Engine(){
//        Log.d(TAG, "Engine: Called");
//    }

    void start();
}
