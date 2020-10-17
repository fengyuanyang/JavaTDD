package com.ordestiny.tdd.designpattern.factorypattern;

import com.ordestiny.tdd.designpattern.factorypattern.car.Car;
import com.ordestiny.tdd.designpattern.factorypattern.car.CarType;

public class CarFactory {
    Car getCar(CarType carType) {
        return carType.getConstructor().get();
    }
}
