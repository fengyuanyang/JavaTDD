package com.ordestiny.tdd.designpattern.factorypattern.animal;

/**
 * @author Rachit Parikh
 */
public class Snake implements Animal {

    @Override
    public int numberOfLegs() {
        return 0;
    }

    @Override
    public AnimalType typeOfAnimal() {
        return AnimalType.REPTILE;
    }
}
