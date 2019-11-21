package com.gzeinnumer.daggerforcar.part;

import android.util.Log;

import com.gzeinnumer.daggerforcar.sub_part.Rims;
import com.gzeinnumer.daggerforcar.sub_part.Tires;

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
