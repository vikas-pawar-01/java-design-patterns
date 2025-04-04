package com.designpattern.patterns.behavioral.observer;

public class MobileSubscriber implements Observer {
    private String name;

    public MobileSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news via Mobile: " + news);
    }
}