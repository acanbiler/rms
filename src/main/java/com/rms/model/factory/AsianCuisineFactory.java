package com.rms.model.factory;

import com.rms.model.beverage.Beverage;
import com.rms.model.beverage.Sake;
import com.rms.model.meal.Meal;
import com.rms.model.meal.Noodle;
import com.rms.model.meal.Sushi;

import java.util.ArrayList;
import java.util.List;

public class AsianCuisineFactory implements AbstractMealFactory {
    @Override
    public Beverage prepareBeverage() {
        return new Sake();
    }

    @Override
    public List<Meal> cookMeal() {
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Sushi());
        mealList.add(new Noodle());

        return mealList;
    }
}
