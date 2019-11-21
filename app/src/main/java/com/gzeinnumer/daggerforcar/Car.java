package com.gzeinnumer.daggerforcar;

import android.util.Log;


import com.gzeinnumer.daggerforcar.part.Engine;
import com.gzeinnumer.daggerforcar.part.Remote;
import com.gzeinnumer.daggerforcar.part.Wheels;

import javax.inject.Inject;

public class Car {

    //todo 1
    private static final String TAG = "MYZEIN";

    @Inject Engine engine;
    private Wheels wheels;

    //Engine dan Wheel harus di inject juga,
    @Inject
    public Car(Wheels wheels) {
        Log.d(TAG, "Car: Called");
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){

        Log.d(TAG, "enableRemote: Called");
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "drive: ");
    }
}
