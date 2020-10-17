package com.ordestiny.tdd.designpattern.factorypattern.car;

public class Jaguar implements Car{
    private String manufacturingCountry;

    public Jaguar() {
        this.manufacturingCountry = "United Kingdom";
    }

    @Override
    public String getManufacturingCountry() {
        return manufacturingCountry;
    }
}
