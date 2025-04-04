package com.designpattern.patterns.behavioral.template;

public class TemplatePatternDemo {
    public static void run() {
        System.out.println("Processing CSV Data:");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        System.out.println("\nProcessing JSON Data:");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process();
    }
}