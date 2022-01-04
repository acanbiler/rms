package com.rms.model.meal;

public class Naan implements Meal{
    @Override
    public String getName() {
        return "Naan";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
