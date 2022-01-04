package com.rms.model.meal;

public class Noodle implements Meal{

    @Override
    public String getName() {
        return "Noodle";
    }

    @Override
    public Integer getCost() {
        return 45;
    }
}
