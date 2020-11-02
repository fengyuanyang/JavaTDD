package com.ordestiny.tdd.concurrent;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * https://levelup.gitconnected.com/deep-dive-countdownlatch-in-java-d33c43f91438
 */
public class SwimmingClass {
    /**
     *
     * @param swimmers
     * @throws InterruptedException
     */
    public Set<String> startSwim(final String[] swimmers) throws InterruptedException {
        // Set to store swimmers who have completed
        final Set<String> goalSwimmer = new HashSet<>();
        // CountDownLatch to make sure all the swimmers have completed.
        final CountDownLatch countDownLatch = new CountDownLatch(swimmers.length);
        for (String swimmer: swimmers) {
            new Thread(() -> {
                goalSwimmer.add(swimmer);
                countDownLatch.countDown();
            }).start();
        }

        // await here , will resume until countDownLatch.countDown() is called (swimmer.length) times in Thread
        countDownLatch.await();

        return goalSwimmer;
    }
}
