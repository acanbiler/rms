package com.rms.model.factory;

import com.rms.model.beverage.Ayran;
import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Kebab;
import com.rms.model.meal.Lahmacun;
import com.rms.model.meal.Meal;

import java.util.ArrayList;
import java.util.List;

public class TurkishCuisineFactory implements AbstractMealFactory {
    @Override
    public Beverage prepareBeverage() {
        return new Ayran();
    }

    @Override
    public List<Meal> cookMeal() {
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Kebab());
        mealList.add(new Lahmacun());

        return mealList;
    }
}
