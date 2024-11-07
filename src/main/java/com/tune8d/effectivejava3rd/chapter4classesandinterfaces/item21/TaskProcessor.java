package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item21;

public interface TaskProcessor<T> {
    void processTask(T task);

    //Default method added for logging, but kept simple to avoid breaking existing implementations.
    default void logTask(T task){
        System.out.println("Processing task: " + task);
    }

    void processTask(String task);
}
