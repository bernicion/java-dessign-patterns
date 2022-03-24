package com.bernic.patterns.behavior.observer;

public interface Observer {
    void update(String descr);
    void subscribe();
    void unSubscribe();
}
