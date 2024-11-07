package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item21;

public class SimpleTaskProcessor implements TaskProcessor<String> {

    @Override
    public void processTask(String task) {
        // Custom implementation of task processing
        System.out.println("Executing task: " + task);
    }
}