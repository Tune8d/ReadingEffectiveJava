package com.tune8d.effectivejava3rd.chapter1and2.builderpattern.classhierarchies;

import static com.tune8d.effectivejava3rd.chapter1and2.builderpattern.classhierarchies.NyPizza.Size.*;

public class PizzaController {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                            .addTopping(Pizza.Topping.SAUSAGE)
                            .addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder()
                            .addTopping(Pizza.Topping.HAM)
                            .sauceInside().build();

        pizza.getPizza();
        System.out.println("");
        calzone.getPizza();
    }
}
