package com.rms.model.coffee;

public class Milk extends CondimentDecorator {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description() + ", Milk";
    }

    @Override
    public Double cost() {
        return coffee.cost() + 0.5;
    }
}
