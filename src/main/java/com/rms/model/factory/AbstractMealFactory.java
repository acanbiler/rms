package com.rms.model.factory;

import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Meal;

import java.util.List;

public interface AbstractMealFactory {
    List<Meal> cookMeal();
    Beverage prepareBeverage();
}
