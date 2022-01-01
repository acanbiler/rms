package com.rms.model.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Espresso implements Coffee {
    private String description;
    private Double cost;

    @Override
    public String description() {
        return description;
    }

    @Override
    public Double cost() {
        return 5.0;
    }
}
