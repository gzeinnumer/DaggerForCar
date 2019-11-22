package com.gzeinnumer.daggerforcar.dagger;

import com.gzeinnumer.daggerforcar.car.Engine;
import com.gzeinnumer.daggerforcar.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine provideEngine1(PetrolEngine petrolEngine);
}
