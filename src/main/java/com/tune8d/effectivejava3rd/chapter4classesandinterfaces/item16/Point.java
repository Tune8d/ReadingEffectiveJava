package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item16;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Encapsulation of data by accessor methods and mutators
    // If a class is accessible outside its package, provide accessor methods.
    // *(Public classes should never expose mutable field.)*
    // However, if a class is package-private or is a private nested class,
    // there is nothing inherently wrong with exposing its data fields.
    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
}
