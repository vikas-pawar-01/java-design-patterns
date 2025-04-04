package com.designpattern.patterns.behavioral.template;

public class CSVDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from a CSV file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data...");
    }
}