package com.tune8d.effectivejava3rd.chapter1and2;

public class StaticFactoryMethods {
    public static void main(String[] args) {

    }
    // static factories are somewhat compact (Overloads inevitable, instances reducible) yet flexible constructors,
    // but cannot be accessed without being public or protected.
    public static Boolean valueof(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
