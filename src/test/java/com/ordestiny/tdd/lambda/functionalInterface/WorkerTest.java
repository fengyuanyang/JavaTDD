package com.ordestiny.tdd.lambda.functionalInterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WorkerTest {
    private final ToyFactory factory = new ToyFactory();
    private final Worker worker = new Worker(factory);

    @Test
    void testCheckProducts() {
        this.worker.checkProducts();
        this.factory.eachToy(toy -> {
            assertTrue(toy.hasQualityCheck());
        });
    }
}