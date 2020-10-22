package com.ordestiny.tdd.designpattern.factorypattern.animal;

/**
 * @author Rachit Parikh
 */
public class Dog implements Animal {

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public AnimalType typeOfAnimal() {
        return AnimalType.MAMMAL;
    }
}
