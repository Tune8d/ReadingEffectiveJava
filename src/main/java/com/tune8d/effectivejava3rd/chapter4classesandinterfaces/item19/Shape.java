package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item19;

// abstract class is designed for a situation where uniqueness diverges from a commonality.

public abstract class Shape {
    // Template method to calculate the area of a shape
    public final double calculateArea() {
        beforeCalculate();
        double area = doCalculateArea();
        afterCalculate();
        return area;
    }

    /**
     * Hook method that subclasses can override to perform an action before area calculation.
     * By default, this does nothing.
     */
    protected void beforeCalculate() {
        // Default behavior (no action).
    }

    /**
     * Hook method that subclasses can override to perform an action after area calculation.
     * By default, this does nothing.
     */
    protected void afterCalculate() {
        // Default behavior (no action).
    }

    /**
     * This is the core method that subclasses must implement to provide the calculation for the area.
     */
    protected abstract double doCalculateArea();
}

