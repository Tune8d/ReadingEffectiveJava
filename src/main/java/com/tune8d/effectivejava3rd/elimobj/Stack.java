package com.tune8d.effectivejava3rd.elimobj;

import java.util.EmptyStackException;
import java.util.Arrays;

/* Whenever a class manages its own memory,
   the programmer should be alert for memory leaks.
* For caches, WeakHashMap is useful as the keys are collected
  if it loses a strong reference.
*/

public class Stack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size]; // save the value of the last index
        elements[size] = null; // Eliminate obsolete reference, as size has been already reduced by 1
        return result; // return the former value of the last index
    }

    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
