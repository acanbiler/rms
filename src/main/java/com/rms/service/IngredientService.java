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

    public void increaseIngredient(Ingredient ingredient) {
        Ingredient persistentIngredient = ingredientRepository.findByName(ingredient.getName());
        persistentIngredient.setQuantity(persistentIngredient.getQuantity() + 10);
        ingredientRepository.save(persistentIngredient);
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    public boolean consumeIngredient(Ingredient ingredient) {
        Ingredient persistenIngredient = ingredientRepository.findByName(ingredient.getName());

        if (persistenIngredient != null) {
            Integer currentQuantity = persistenIngredient.getQuantity();

            if (ingredient.getQuantity() < currentQuantity) {
                persistenIngredient.setQuantity(currentQuantity - ingredient.getQuantity());
                ingredientRepository.save(persistenIngredient);
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

}
