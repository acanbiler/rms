package com.rms.model.meal;

public class Naan implements Meal{
    @Override
    public String getCuisine() {
        return "Indian";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
