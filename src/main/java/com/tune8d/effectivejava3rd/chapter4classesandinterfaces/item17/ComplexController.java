package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item17;

public class ComplexController {
    public static void main(String[] args) {
        Complex cx = Complex.valueOf(1.00, -2);
        Complex cy = Complex.valueOf(2.00, -3);

        System.out.println(cx);

        Complex result = cx.plus(cy);
        System.out.println(result);
    }
}
