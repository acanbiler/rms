package com.rms.model.pizza;

import lombok.Getter;

@Getter
public class Pizza {
    private Integer size;
    private Integer cost;
    private Boolean cheese;
    private Boolean pepperoni;
    private Boolean mushroom;


    private Pizza(PizzaBuilder builder) {
        size = builder.size;
        cost = builder.cost;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        mushroom = builder.mushroom;
    }

    public static class PizzaBuilder {
        private final Integer size;
        private Integer cost;
        private Boolean cheese = false;
        private Boolean pepperoni = false;
        private Boolean mushroom = false;

        public PizzaBuilder(Integer size) {
            this.size = size;
            this.cost = size * 20;
        }

        public PizzaBuilder cheese(Boolean value) {
            cheese = value;
            this.cost += 5;
            return this;
        }

        public PizzaBuilder pepperoni(Boolean value) {
            pepperoni = value;
            this.cost += 15;
            return this;
        }

        public PizzaBuilder mushroom(Boolean value) {
            mushroom = value;
            this.cost += 10;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
