package com.bernic.patterns.behavior.observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    private final List<Observer> observers;
    private String subjectDetails;
    private String desc;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        this.notifyObservers();
    }

    @Override
    public void subscriberObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEachOrdered(o -> o.update(this.desc));
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
