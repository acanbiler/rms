package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Kebab implements Meal {
    private @Autowired
    IngredientService ingredientService;

    public Kebab() {
        ingredientService.consumeIngredient("meat", 5);
        ingredientService.consumeIngredient("rice", 1);
    }

    @Override
    public Integer getCost() {
        return 70;
    }

    @Override
    public String getCuisine() {
        return "Turkish";
    }
}
