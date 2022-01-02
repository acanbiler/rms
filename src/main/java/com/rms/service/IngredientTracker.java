package com.rms.service;

import com.rms.model.entity.Ingredient;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class IngredientTracker {
    private Ingredient ingredientName;

    private PropertyChangeSupport support;

    public IngredientTracker() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void notifyIngredientStatus(String ingredientName) {
        support.firePropertyChange("ingredientName", this.ingredientName, ingredientName);
    }
}
