package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item21;

/*
- Keep interfaces minimal and focused.
- Avoid default methods unless there is a strong need.
- Encapsulate additional features and specific behavior in classes that implement the interface.
- Favor composition for adding functionalities, which makes your design more flexible and less tightly coupled.
*/

public class TaskController {
    public static void main(String[] args) {
        SimpleTaskProcessor simpleProcessor = new SimpleTaskProcessor();
        simpleProcessor.processTask("Simple Task");

        AdvancedTaskProcessor advancedProcessor = new AdvancedTaskProcessor();
        advancedProcessor.processTask("Advanced Task");
        advancedProcessor.logTask("Advanced Task");
    }
}
