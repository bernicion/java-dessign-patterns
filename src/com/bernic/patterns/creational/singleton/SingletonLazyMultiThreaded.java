package com.bernic.patterns.creational.singleton;

/**
 *
 * This is syncronized but can be time/resource consuming
 */
public class SingletonLazyMultiThreaded {

    private static SingletonLazyMultiThreaded sc = null;

    private SingletonLazyMultiThreaded() {
    }

    public static synchronized SingletonLazyMultiThreaded getInstance() {
        if (sc == null) {
            sc = new SingletonLazyMultiThreaded();
        }
        return sc;
    }
}
