package com.tune8d.effectivejava3rd.builderpattern.classhierarchies;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build(){
            return new NyPizza(this);
        }

        // For type safety when chaining methods in NyPizza.Builder.
        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder){
        super(builder);
        size = builder.size;
    }

    public void getPizza(){
        System.out.println("Pizza name: New York Pizza");
        for(Topping t : toppings){
            System.out.println("Topping: " + t);
        }
        System.out.println("Size: " + size);
    }
}
