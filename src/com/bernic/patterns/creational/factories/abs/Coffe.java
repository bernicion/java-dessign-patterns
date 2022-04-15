package com.bernic.patterns.creational.factories.abs;

public class Coffe implements HotDrink{
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
