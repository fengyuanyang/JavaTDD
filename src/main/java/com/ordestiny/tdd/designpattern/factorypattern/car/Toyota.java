package com.ordestiny.tdd.designpattern.factorypattern.car;

public class Toyota implements Car{
    private String manufacturingCountry;

    public Toyota() {
        this.manufacturingCountry = "Japan";
    }
    @Override
    public String getManufacturingCountry() {
        return manufacturingCountry;
    }
}
