package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Lahmacun implements Meal {
    private @Autowired
    IngredientService ingredientService;

    public Lahmacun() {
        ingredientService.consumeIngredient("meat", 1);
        ingredientService.consumeIngredient("garlic", 1);
        ingredientService.consumeIngredient("tomatoes", 1);
    }

    @Override
    public String getCuisine() {
        return "Turkish";
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
