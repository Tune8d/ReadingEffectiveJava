package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item21;

public class AdvancedTaskProcessor implements TaskProcessor<String> {
    @Override
    public void processTask(String task) {
        // Advanced processing logic
        System.out.println("Advanced execution of task: " + task);
    }

    @Override
    public void logTask(String task) {
        // Overriding the default method to provide more detailed logging
        System.out.println("Advanced processing of task with details: " + task);
    }
}