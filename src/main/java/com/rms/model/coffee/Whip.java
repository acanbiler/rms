package com.rms.model.coffee;

public class Whip extends CondimentDecorator {
    Coffee coffee;

    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description() + ", Whip";
    }

    @Override
    public Double cost() {
        return coffee.cost() + 0.25;
    }
}
