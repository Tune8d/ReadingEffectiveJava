package com.tune8d.effectivejava3rd.builderpattern.classhierarchies;

import static com.tune8d.effectivejava3rd.builderpattern.classhierarchies.NyPizza.Size.*;
import static com.tune8d.effectivejava3rd.builderpattern.classhierarchies.Pizza.Topping.*;

public class PizzaController {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                            .addTopping(SAUSAGE)
                            .addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                            .addTopping(HAM)
                            .sauceInside().build();

        pizza.getPizza();
        System.out.println("");
        calzone.getPizza();
    }
}
