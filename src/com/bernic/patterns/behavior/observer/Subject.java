package com.bernic.patterns.behavior.observer;

public interface Subject {
    void subscriberObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();
}
