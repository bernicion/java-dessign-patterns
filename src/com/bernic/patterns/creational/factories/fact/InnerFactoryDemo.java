package com.bernic.patterns.creational.factories.fact;

enum CoordinateSystem {
    CARTESIAN,
    POLAR
}

class Point1 {
    double x, y;

    private Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static class Factory {
        public static Point1 createPoint(double x, double y, CoordinateSystem cs) {
            if (cs.equals(CoordinateSystem.CARTESIAN)) {
                return new Point1(x, y);
            } else {
                return new Point1(x * Math.cos(y), x * Math.sin(y));
            }
        }
    }
}

public class InnerFactoryDemo {
    Point1 point1 = Point1.Factory.createPoint(4, 5, CoordinateSystem.CARTESIAN);
}
