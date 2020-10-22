package com.ordestiny.tdd.designpattern.factorypattern;

import com.ordestiny.tdd.designpattern.factorypattern.animal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rachit Parikh
 */

public class AnimalFactoryTest {

    Animal animal;

    // CheckX test classes will check whether the factory method is able to create X
    // It will also test if it working correctly, i.e whether the data returned by the class is correct or not

    @Test
    public void checkDog() throws Exception{
        animal = AnimalFactory.getAnimal("DOG");
        assertEquals(animal.getClass(), Dog.class);
        assertEquals(animal.numberOfLegs(), 4);
        assertEquals(animal.typeOfAnimal(), AnimalType.MAMMAL);
    }

    @Test
    public void checkHuman() throws Exception{
        animal = AnimalFactory.getAnimal("HUMAN");
        assertEquals(animal.getClass(), Human.class);
        assertEquals(animal.numberOfLegs(), 2);
        assertEquals(animal.typeOfAnimal(), AnimalType.MAMMAL);
    }

    @Test
    public void checkSalmon() throws Exception{
        animal = AnimalFactory.getAnimal("SALMON");
        assertEquals(animal.getClass(), Salmon.class);
        assertEquals(animal.numberOfLegs(), 0);
        assertEquals(animal.typeOfAnimal(), AnimalType.FISH);
    }

    @Test
    public void checkSnake() throws Exception{
        animal = AnimalFactory.getAnimal("SNAKE");
        assertEquals(animal.getClass(), Snake.class);
        assertEquals(animal.numberOfLegs(), 0);
        assertEquals(animal.typeOfAnimal(), AnimalType.REPTILE);
    }

    @Test
    public void checkEarthworm() throws Exception{
        animal = AnimalFactory.getAnimal("EARTHWORM");
        assertEquals(animal.getClass(), Earthworm.class);
        assertEquals(animal.numberOfLegs(), 0);
        assertEquals(animal.typeOfAnimal(), AnimalType.INVERTEBRATE);
    }

    @Test
    public void checkEagle() throws Exception{
        animal = AnimalFactory.getAnimal("EAGLE");
        assertEquals(animal.getClass(), Eagle.class);
        assertEquals(animal.numberOfLegs(), 2);
        assertEquals(animal.typeOfAnimal(), AnimalType.BIRD);
    }

    @Test
    public void checkFrog() throws Exception{
        animal = AnimalFactory.getAnimal("FROG");
        assertEquals(animal.getClass(), Frog.class);
        assertEquals(animal.numberOfLegs(), 2);
        assertEquals(animal.typeOfAnimal(), AnimalType.AMPHIBIAN);
    }

    @Test
    public void checkBat() throws Exception{
        try {
            animal = AnimalFactory.getAnimal("BAT");
        }
        catch (Exception e) {
            assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }

    @Test
    public void checkTelevision() throws Exception{
        try{
            animal = AnimalFactory.getAnimal("TELEVISION");
        }
        catch (Exception e){
            assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }

}
