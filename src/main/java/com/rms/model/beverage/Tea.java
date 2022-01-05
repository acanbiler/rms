package com.rms.model.beverage;

public class Tea extends BaverageTemplate {
    private String message;

    @Override
    void brew() {
        message = super.message;
        message += "\nSteeping the tea";
    }

    @Override
    void addCondiments() {
        message += super.message;
        message += "\nAdding Lemon";
    }

    public String getMessage() {
        return message;
    }
}
