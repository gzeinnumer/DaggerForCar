package com.gzeinnumer.daggerforcar.dagger;

import com.gzeinnumer.daggerforcar.car.DieselEngine;
import com.gzeinnumer.daggerforcar.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine provideEngine2(DieselEngine engine);
}
