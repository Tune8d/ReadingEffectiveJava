package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item19;

// Example of a concrete subclass designed to extend Shape
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    protected double doCalculateArea() {
        // Implementation of area calculation for a circle: A = π * r * r
        return Math.PI * radius * radius;
    }

    @Override
    protected void beforeCalculate() {
        System.out.println("Starting area calculation for Circle.");
    }

    @Override
    protected void afterCalculate() {
        System.out.println("Finished area calculation for Circle.");
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area: " + area);
    }
}

