package com.tune8d.effectivejava3rd.chapter1and2.dependencyinjection;

import java.util.Objects;

// Do not use a singleton or static utility class to implement a class
// that depends on one or more underlying resources whose behavior affects tat of the class.
// And do not have the class create these resources directly.

// Instead, pass the resources, or factories to create them, into the constructor (or static factory or builder)
// This practice is known as dependency injection and will greatly enhance flexibility, reusability, and testability of a class.
public class SpellChecker {
    private final Lexicon dictionary;

    // Because spell-check can vary by the type of dictionaries,
    // the dictionary data is injected to the constructor of the spell-check as it is dependent on it.
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {return false;}
}
