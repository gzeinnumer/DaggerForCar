package com.gzeinnumer.daggerforcar.car;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "MYZEIN";
    //todo 3
    //todo 4 rebuild dulu

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires){
        Log.d(TAG, "Wheels: Called");
        this.rims = rims;
        this.tires = tires;
    }
}
