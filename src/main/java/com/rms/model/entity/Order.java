package com.rms.model.entity;

import com.rms.model.beverage.Beverage;
import com.rms.model.meal.Meal;
import lombok.Data;

import java.util.List;

@Data
public class Order {

    private long id;
    private List<Meal> mealList;
    private Beverage beverage;
    private User server;
    private User cook;
    private Integer status;
}
