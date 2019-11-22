package com.gzeinnumer.daggerforcar.dagger;

import android.util.Log;

import com.gzeinnumer.daggerforcar.car.Wheels;
import com.gzeinnumer.daggerforcar.car.Rims;
import com.gzeinnumer.daggerforcar.car.Tires;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    private static final String TAG = "MYZEIN";
    @Provides
    static Rims provideRims(){
        Log.d(TAG, "provideRims: called");
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Log.d(TAG, "provideTires: called");
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        Log.d(TAG, "provideWheels: called");
        return new Wheels(rims, tires);
    }
}
