package com.gzeinnumer.daggerforcar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //build dulu baru buat ini
        CarCompnent compnent = DaggerCarCompnent.create();

        car = compnent.getCar();
        car.drive();
    }
}
