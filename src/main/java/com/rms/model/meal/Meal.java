package com.rms.model.meal;

import com.rms.model.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;

public interface Meal {
    public String getCuisine();
    public Integer getCost();
    public List<Ingredient> ingredientList = new ArrayList<>();
}
