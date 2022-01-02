package com.rms.model.factory;

import com.rms.model.beverage.Beverage;
import com.rms.model.beverage.Chai;
import com.rms.model.meal.Curry;
import com.rms.model.meal.Meal;
import com.rms.model.meal.Naan;

import java.util.ArrayList;
import java.util.List;

public class IndianCusineFactory implements AbstractMealFactory {
    @Override
    public Beverage prepareBeverage() {
        return new Chai();
    }

    @Override
    public List<Meal> cookMeal() {
        List<Meal> mealList = new ArrayList<>();
        mealList.add(new Naan());
        mealList.add(new Curry());

        return mealList;
    }
}
