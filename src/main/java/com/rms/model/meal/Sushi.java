package com.rms.model.meal;

public class Sushi implements Meal {
    @Override
    public String getCuisine() {
        return "Asian";
    }

    @Override
    public Integer getCost() {
        return 60;
    }
}
