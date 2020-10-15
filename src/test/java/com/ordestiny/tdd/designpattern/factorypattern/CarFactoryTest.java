package com.ordestiny.tdd.designpattern.factorypattern;

import com.ordestiny.tdd.designpattern.factorypattern.car.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.ordestiny.tdd.designpattern.factorypattern.car.CarType.*;

public class CarFactoryTest {

    @Test
    public void shouldCreateNewCarFactory() {
        CarFactory carFactory = new CarFactory();
        Assertions.assertEquals(carFactory.getClass(), CarFactory.class);
    }

    @Test
    public void shouldCreateCarTypeBENZ() {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(BENZ);
        Assertions.assertEquals(car.getClass(), Benz.class);
        Assertions.assertEquals(car.getManufacturingCountry(), "German");
    }

    @Test
    public void shouldCreateCarTypeBMW() {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(BMW);
        Assertions.assertEquals(car.getClass(), Bmw.class);
        Assertions.assertEquals(car.getManufacturingCountry(), "German");
    }

    @Test
    public void shouldCreateCarTypeJaguar() {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(JAGUAR);
        Assertions.assertEquals(car.getClass(), Jaguar.class);
        Assertions.assertEquals(car.getManufacturingCountry(), "United Kingdom");
    }
    @Test
    public void shouldCreateCarTypeToyota() {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(TOYOTA);
        Assertions.assertEquals(car.getClass(), Toyota.class);
        Assertions.assertEquals(car.getManufacturingCountry(), "Japan");
    }

}
