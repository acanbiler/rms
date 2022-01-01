package com.rms.model.coffee;

public abstract class CondimentDecorator implements Coffee {
    private Coffee coffee;

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public Double cost() {
        return coffee.cost();
    }
}
