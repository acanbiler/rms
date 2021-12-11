package com.rms.service;

import com.rms.model.entity.Ingredient;
import com.rms.model.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    private @Autowired
    IngredientRepository ingredientRepository;

    public List<Ingredient> listIngredients() {
        return ingredientRepository.findAll();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }

}
