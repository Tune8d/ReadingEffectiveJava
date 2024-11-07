package com.tune8d.effectivejava3rd.chapter1and2.noninstantiability;


public class UtilityController {
    public static void main(String[] args) {
        int result = UtilityClass.addNumbers(1,2);
        // UtilityClass uc = new UtilityClass(); // cannot be accessed due to the constructor being "private"
        System.out.println(result);
    }
}
