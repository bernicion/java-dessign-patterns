package com.bernic.patterns.creational.factories.abs;

public class CoffeeFactory implements HotDrinkFactory{
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour " + amount + " ml, add sugar, enjoy!");
        return new Coffe();
    }
}
