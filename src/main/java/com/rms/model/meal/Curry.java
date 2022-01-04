package com.rms.model.meal;

public class Curry implements Meal {
    @Override
    public String getName() {
        return "Curry";
    }

    @Override
    public Integer getCost() {
        return 50;
    }
}
