package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Naan implements Meal{
    private @Autowired
    IngredientService ingredientService;

    public Naan() {
        ingredientService.consumeIngredient("flour", 3);
    }

    @Override
    public String getCuisine() {
        return "Indian";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
