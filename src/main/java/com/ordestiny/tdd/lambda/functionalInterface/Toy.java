package com.ordestiny.tdd.lambda.functionalInterface;

public class Toy {
    private boolean hasQualityCheck;

    public boolean hasQualityCheck() {
        return hasQualityCheck;
    }

    public void setHasQualityCheck(boolean hasQualityCheck) {
        this.hasQualityCheck = hasQualityCheck;
    }

    public Toy() {
        hasQualityCheck = false;
    }
}
