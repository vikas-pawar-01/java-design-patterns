package com.designpattern.patterns.behavioral.template;

public abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        saveData();
    }

    // Steps to be implemented by subclasses
    protected abstract void readData();
    protected abstract void processData();

    // Common step
    protected void saveData() {
        System.out.println("Saving processed data...");
    }
}