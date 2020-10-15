package com.ordestiny.tdd.designpattern.factorypattern.car;

public class Benz implements Car {
    private String manufacturingCountry;

    public Benz() {
        this.manufacturingCountry = "German";
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }
}
