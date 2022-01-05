package com.rms.model.beverage;

public class HotChocolate extends BaverageTemplate{
    private String message;

    @Override
    void brew() {
        message = super.message;
        message += "\nAdd HotChocolate core";
    }

    @Override
    void addCondiments() {
        message += super.message;
        message += "\nAdding Sugar";
    }

    public String getMessage() {
        return message;
    }
}
