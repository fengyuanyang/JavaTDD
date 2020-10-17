package com.ordestiny.tdd.designpattern.factorypattern;

import com.ordestiny.tdd.designpattern.factorypattern.animal.Animal;
import com.ordestiny.tdd.designpattern.factorypattern.animal.AnimalEnum;

import java.security.InvalidParameterException;
import java.text.MessageFormat;

/**
 * @author Rachit Parikh
 */
public class AnimalFactory {
    public static Animal getAnimal(AnimalEnum animalEnum) {
        if(animalEnum.getInstance() == null){
            throw new InvalidParameterException();
        }
        return animalEnum.getInstance();
    }
}
