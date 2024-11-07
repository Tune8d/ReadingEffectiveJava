package com.tune8d.effectivejava3rd.chapter1and2.builderpattern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    // Define a subclass called Builder, which explicitly define methods for each parameter based on their necessity
    // and add on a method that returns an instance as well.
    // Great for classes with a handful of parameters.
    public static class Builder{
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val; return this;
        }

        public Builder fat(int val){
            fat = val; return this;
        }

        public Builder sodium(int val){
            sodium = val; return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    // Constructor based on the Builder class, as this format of instance is defined in the Bulid.build();
    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public void getNutritionFacts(){
        System.out.println("Serving size: " + servingSize);
        System.out.println("Servings: " + servings);
        System.out.println("Calories: " + calories);
        System.out.println("Fat: " + fat);
        System.out.println("Sodium: " + sodium);
        System.out.println("carbohydrate " + carbohydrate);
    }
}
