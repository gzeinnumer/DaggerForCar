package com.gzeinnumer.daggerforcar.car;

import android.util.Log;


import javax.inject.Inject;

public class Car {

    //todo 1
    private static final String TAG = "MYZEIN";

    private Engine engine;
    private Wheels wheels;

    //Engine dan Wheel harus di inject juga,
    @Inject
    public Car(Engine engine, Wheels wheels) {
        Log.d(TAG, "Car: Called");
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){

        Log.d(TAG, "enableRemote: Called");
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "drive: ");
    }
}