package com.rms.model.meal;

public class Lahmacun implements Meal {
    @Override
    public String getName() {
        return "Lahmacun";
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
