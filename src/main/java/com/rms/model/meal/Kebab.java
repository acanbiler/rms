package com.rms.model.meal;

public class Kebab implements Meal {

    @Override
    public Integer getCost() {
        return 70;
    }

    @Override
    public String getName() {
        return "Kebab";
    }
}
