package com.rms.model.beverage;

public class HotChocolate implements Beverage{
    @Override
    public String getType() {
        return "HotChocolate served.";
    }

    void prepareRecipe() {
        boilMilk();
        brewHotChocolateGrinds();
        pourInCup();
        addSugar();
    }

    public void boilMilk() {
        System.out.println("Boiling water and milk");
    }

    public void brewHotChocolateGrinds() {
        System.out.println("Add HotChocolate core");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugar() {
        System.out.println("Adding Sugar");
    }

}
