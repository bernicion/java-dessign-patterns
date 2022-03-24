package com.bernic.patterns.behavior.observer;

public class SmsUsers implements Observer {
    private final Subject subject;
    private String desc;
    private String userInfo;

    public SmsUsers(Subject subject, String userInfo) {
        if (subject == null) {
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String descr) {
        this.desc = descr;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + desc);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.subscriberObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
}
