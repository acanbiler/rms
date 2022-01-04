package com.rms.model.meal;

public class Sushi implements Meal {

    @Override
    public String getName() {
        return "Sushi";
    }

    @Override
    public Integer getCost() {
        return 60;
    }
}
