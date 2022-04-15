package com.bernic.patterns.creational.factories.abs;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();
    }
}
