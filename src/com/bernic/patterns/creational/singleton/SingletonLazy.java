package com.bernic.patterns.creational.singleton;

/**
 *
 * This will fail in multithreaded environment
 */
public class SingletonLazy {
    private static SingletonLazy sc = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (sc == null) {
            sc = new SingletonLazy();
        }
        return sc;
    }

}
