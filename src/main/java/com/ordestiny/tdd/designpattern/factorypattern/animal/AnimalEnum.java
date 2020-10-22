package com.ordestiny.tdd.designpattern.factorypattern.animal;

import java.security.InvalidParameterException;
import java.text.MessageFormat;
import java.util.function.Supplier;

/**
 * @author Rachit Parikh
 */
public enum AnimalEnum {
    DOG(Dog::new), HUMAN(Human::new), SNAKE(Snake::new), FROG(Frog::new),
    EAGLE(Eagle::new), SALMON(Salmon::new), EARTHWORM(Earthworm::new);

    private Supplier<Animal> initiator;

    public Animal getInstance(){
        return initiator.get();
    }

    AnimalEnum(Supplier<Animal> initiator){
        this.initiator = initiator;
    }
}
