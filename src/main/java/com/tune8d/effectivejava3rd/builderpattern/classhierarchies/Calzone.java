package com.tune8d.effectivejava3rd.builderpattern.classhierarchies;

public class Calzone extends Pizza{
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside = false; // default value

        public Builder sauceInside(){
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build(){
            return new Calzone(this);
        }

        @Override
        protected Builder self(){
            return this;
        }
    }

    private Calzone(Builder builder){
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public void getPizza(){
        System.out.println("Pizza name: Calzone");

        for(Topping t : toppings){
            System.out.println("Topping: " + t);
        }
        System.out.println("Sauce Inside: " + sauceInside);
    }
}
