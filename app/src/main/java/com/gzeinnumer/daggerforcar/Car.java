package com.gzeinnumer.daggerforcar;

import android.util.Log;


import com.gzeinnumer.daggerforcar.part.Engine;
import com.gzeinnumer.daggerforcar.part.Wheels;

import javax.inject.Inject;

public class Car {

    //todo 1
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    //Engine dan Wheel harus di inject juga,
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    public void drive(){
        Log.d(TAG, "drive: ");
    }
}
