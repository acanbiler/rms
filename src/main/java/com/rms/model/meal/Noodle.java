package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Noodle implements Meal{
    private @Autowired
    IngredientService ingredientService;

    public Noodle() {
        ingredientService.consumeIngredient("noodle", 3);
        ingredientService.consumeIngredient("shrimp", 1);
    }

    @Override
    public String getCuisine() {
        return "Asian";
    }

    @Override
    public Integer getCost() {
        return 45;
    }
}
