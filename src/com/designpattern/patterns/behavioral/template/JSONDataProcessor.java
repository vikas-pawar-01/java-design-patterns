package com.designpattern.patterns.behavioral.template;

public class JSONDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from a JSON file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data...");
    }
}