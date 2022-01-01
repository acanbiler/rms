package com.rms.model.meal;

import com.rms.model.entity.Ingredient;

public class Kebab implements Meal {
    @Override
    public Integer getCost() {
        return 70;
    }

    @Override
    public String getCuisine() {
        return "Turkish";
    }
}
