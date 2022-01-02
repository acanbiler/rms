package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Curry implements Meal {
    private @Autowired IngredientService ingredientService;

    public Curry() {
        ingredientService.consumeIngredient("chicken", 1);
        ingredientService.consumeIngredient("curry", 5);
    }

    @Override
    public String getCuisine() {
        return "Indian";
    }

    @Override
    public Integer getCost() {
        return 50;
    }
}
