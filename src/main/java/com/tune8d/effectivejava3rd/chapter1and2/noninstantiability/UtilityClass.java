package com.tune8d.effectivejava3rd.chapter1and2.noninstantiability;

// Abstract class does not fulfill the mission of noninstantiability since its subclass can be instantized.
// Noninstantiability can be a valid option when grouping static methods.

//Non-instantiable utility class
public class UtilityClass {
    //Suppress default constructor for non-instantiablity
    private UtilityClass(){
        throw new AssertionError(); // insurance for a possible invoke.
    }

    public static int addNumbers(int a, int b){
        return a + b;
    }
}
