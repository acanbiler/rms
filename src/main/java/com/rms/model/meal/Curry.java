package com.rms.model.meal;

public class Curry implements Meal {
    @Override
    public String getCuisine() {
        return "Indian";
    }

    @Override
    public Integer getCost() {
        return 50;
    }
}
