package com.tune8d.effectivejava3rd.chapter1and2.builderpattern;

public class NuturitionFactsController {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                                    .calories(100).sodium(35).carbohydrate(27).build();

        cocaCola.getNutritionFacts();


    }
}
