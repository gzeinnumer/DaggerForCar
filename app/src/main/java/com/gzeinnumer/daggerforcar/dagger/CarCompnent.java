package com.gzeinnumer.daggerforcar.dagger;

import com.gzeinnumer.daggerforcar.MainActivity;
import com.gzeinnumer.daggerforcar.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarCompnent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
