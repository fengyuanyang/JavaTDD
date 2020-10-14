package com.ordestiny.tdd.lambda.functionalInterface;

public class Worker {
    private final ToyFactory factory;

    /**
     * Construct Worker
     * @param factory ToyFactory
     */
    Worker(ToyFactory factory) {
        this.factory = factory;
    }

    /**
     * Quality check all products in the factory
     */
    void checkProducts() {
        this.factory.eachToy(toy -> toy.setHasQualityCheck(true));
    }
}
