package com.tune8d.effectivejava3rd.builderpattern.classhierarchies;

import java.util.Objects;
import java.util.Set;
import java.util.EnumSet;

// Builder pattern for class hierarchies
// FYI: Generics is a concept that enables the programmer to manage a variety of datatypes while maintaining type safety.
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this" protected abstract T self();
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }
}
