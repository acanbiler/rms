package com.rms.model.pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PizzaOrder {
    private Integer size;
    private Boolean cheese;
    private Boolean pepperoni;
    private Boolean mushroom;
}
