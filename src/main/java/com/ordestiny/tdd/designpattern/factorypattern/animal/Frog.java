package com.ordestiny.tdd.designpattern.factorypattern.animal;

/**
 * @author Rachit Parikh
 */
public class Frog implements Animal {
    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public AnimalType typeOfAnimal() {
        return AnimalType.AMPHIBIAN;
    }
}
