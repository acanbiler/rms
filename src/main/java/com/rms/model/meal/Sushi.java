package com.rms.model.meal;

import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

public class Sushi implements Meal {
    private @Autowired
    IngredientService ingredientService;

    public Sushi () {
        ingredientService.consumeIngredient("fish", 2);
        ingredientService.consumeIngredient("rice", 3);
        ingredientService.consumeIngredient("wasabi", 1);
    }

    @Override
    public String getCuisine() {
        return "Asian";
    }

    @Override
    public Integer getCost() {
        return 60;
    }
}
