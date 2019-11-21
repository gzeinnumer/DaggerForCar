package com.gzeinnumer.daggerforcar;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarCompnent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
