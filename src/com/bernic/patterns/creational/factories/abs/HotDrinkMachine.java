package com.bernic.patterns.creational.factories.abs;

import java.util.HashMap;
import java.util.Map;

public class HotDrinkMachine {

    public enum AvailableDrink
    {
        COFFEE, TEA
    }

    private Map<AvailableDrink, HotDrinkFactory> factories =
            new HashMap<>();

    public HotDrinkMachine() throws Exception
    {
        // option 1: use an enum
        for (AvailableDrink drink : AvailableDrink.values())
        {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("com.bernic.patterns.creational.factories.abs." + factoryName + "Factory");
            factories.put(drink, (HotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

    }

    public HotDrink makeDrink(AvailableDrink drink, int amount)
    {
        return ((HotDrinkFactory)factories.get(drink)).prepare(amount);
    }
}
