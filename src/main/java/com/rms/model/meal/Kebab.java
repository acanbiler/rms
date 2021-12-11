package com.rms.model.meal;

import com.rms.model.entity.Ingredient;

public class Kebab implements Meal {
    public Kebab () {
        super();
        ingredientList.add(new Ingredient("Un", 2));
        ingredientList.add(new Ingredient("Kıyma", 10));
    }

    @Override
    public String getCuisine() {
        return "Turkish";
    }
}
