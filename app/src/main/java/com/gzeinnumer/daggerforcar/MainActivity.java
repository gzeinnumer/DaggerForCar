package com.gzeinnumer.daggerforcar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gzeinnumer.daggerforcar.car.Car;
import com.gzeinnumer.daggerforcar.dagger.CarCompnent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //build dulu baru buat ini
        CarCompnent compnent = DaggerCarCompnent.create();
        //car = compnent.getCar();
        compnent.inject(this);

        car.drive();
    }
}
