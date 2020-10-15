package com.ordestiny.tdd.designpattern.factorypattern.car;

import java.util.function.Supplier;

public enum CarType {
    BENZ(Benz::new), BMW(Bmw::new), TOYOTA(Toyota::new), JAGUAR(Jaguar::new);
    private final Supplier<Car> constructor;

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return this.constructor;
    }
}
