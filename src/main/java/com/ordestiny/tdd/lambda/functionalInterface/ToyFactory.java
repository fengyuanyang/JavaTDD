package com.ordestiny.tdd.lambda.functionalInterface;

public class ToyFactory {
    private final Toy[] inventory = new Toy[10];

    ToyFactory() {
        for (int i = 0; i < 10; i++) {
            inventory[i] = new Toy();
        }
    }

    /**
     * Handle each toy
     * @param func FunctionalInterface
     */
    public void eachToy(FunctionalInterface func) {
        for (Toy toy : inventory) {
            func.apply(toy);
        }
    }
}
