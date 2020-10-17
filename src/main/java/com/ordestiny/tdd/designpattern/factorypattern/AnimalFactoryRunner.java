package com.ordestiny.tdd.designpattern.factorypattern;

import com.ordestiny.tdd.designpattern.factorypattern.animal.Animal;
import com.ordestiny.tdd.designpattern.factorypattern.animal.AnimalEnum;

/**
 * @author Rachit Parikh
 */
public class AnimalFactoryRunner {
    public static void main(String[] args) {

        Animal dog = null;

        // If the given animal is not present in the enum, it throws an exception
        try {
            dog = AnimalFactory.getAnimal(AnimalEnum.DOG);
            System.out.println(AnimalEnum.DOG.toString() + " has " + dog.numberOfLegs() + " legs");
            System.out.println(AnimalEnum.DOG.toString() + " is a " + dog.typeOfAnimal());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
