package com.rms.model.meal;

public class Noodle implements Meal{
    @Override
    public String getCuisine() {
        return "Asian";
    }

    @Override
    public Integer getCost() {
        return 45;
    }
}
