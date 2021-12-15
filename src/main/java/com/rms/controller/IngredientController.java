package com.rms.controller;

import com.rms.model.entity.Ingredient;
import com.rms.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private @Autowired
    IngredientService ingredientService;

    @GetMapping(value = "/list")
    public List<Ingredient> listIngredients() {
        return ingredientService.listIngredients();
    }

    @PostMapping(value = "/add")
    public void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
    }
}
