package com.designpattern.patterns.behavioral.observer;

public class EmailSubscriber implements Observer {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news via Email: " + news);
    }
}