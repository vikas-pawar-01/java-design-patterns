package com.designpattern.patterns.behavioral.observer;

public class ObserverPatternDemo {
    public static void run() {
        NewsAgency newsAgency = new NewsAgency();

        Observer emailSubscriber = new EmailSubscriber("Alice");
        Observer mobileSubscriber = new MobileSubscriber("Bob");

        newsAgency.addObserver(emailSubscriber);
        newsAgency.addObserver(mobileSubscriber);

        newsAgency.setLatestNews("Breaking News: Observer Pattern Implemented!");
        newsAgency.setLatestNews("Update: Observer Pattern Example Completed!");
    }
}