package com.tune8d.effectivejava3rd.chapter1and2.elimobj;

public class StackController {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.pop().toString());

    }
}
