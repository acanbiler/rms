package com.rms.model.beverage;

public abstract class BaverageTemplate {
    protected String message;

    public final void prepareRecipe(String type) {
        boil(type);
        brew();
        pourInCup();
        addCondiments();
    }

    void boil(String type) {
        message = "Boiling " + type + "...";
    }

    void pourInCup() {
        message = "\nPouring in cup...";
    }

    abstract void brew();

    abstract void addCondiments();
}
