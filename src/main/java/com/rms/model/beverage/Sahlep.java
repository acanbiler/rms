package com.rms.model.beverage;

public class Sahlep extends BaverageTemplate {
    private String message;

    @Override
    void brew() {
        message = super.message;
        message += "\nAdd Sahlep core";
    }

    @Override
    void addCondiments() {
        message += super.message;
        message += "\nTarcining...";
    }

    public String getMessage() {
        return message;
    }
}
