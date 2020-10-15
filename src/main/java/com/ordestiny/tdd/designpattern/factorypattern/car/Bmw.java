package com.ordestiny.tdd.designpattern.factorypattern.car;

public class Bmw implements Car{
    private String manufacturingCountry;

    public Bmw() {
        this.manufacturingCountry = "German";
    }

    @Override
    public String getManufacturingCountry() {
        return manufacturingCountry;
    }
}
