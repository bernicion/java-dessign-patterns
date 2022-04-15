package com.bernic.patterns.creational.factories.fact;

class Point {
    private final double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // factory method
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}

public class FactoryMethodDemo {
    Point point1 = Point.newCartesianPoint(1, 2);
    Point point2 = Point.newPolarPoint(4, 5);
}
