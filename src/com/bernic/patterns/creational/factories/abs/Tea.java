package com.bernic.patterns.creational.factories.abs;

public class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is delicious");
    }
}
