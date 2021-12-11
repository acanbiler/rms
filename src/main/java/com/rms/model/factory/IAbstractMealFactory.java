package com.rms.model.factory;

import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Meal;

import java.util.List;

public interface IAbstractMealFactory {
    List<Meal> cookMeal();
    Beverage prepareBeverage();
}
