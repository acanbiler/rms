package com.rms.model.meal;

import com.rms.model.entity.Ingredient;

public class Kebab implements Meal {


    @Override
    public String getCuisine() {
        return "Turkish";
    }
}
