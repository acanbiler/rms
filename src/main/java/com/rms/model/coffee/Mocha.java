package com.rms.model.coffee;

public class Mocha extends CondimentDecorator {
    Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description() + ", Mocha";
    }

    @Override
    public Double cost() {
        return coffee.cost() + 1;
    }
}
