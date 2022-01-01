package com.rms.model.meal;

public class Lahmacun implements Meal {
    @Override
    public String getCuisine() {
        return "Turkish";
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
