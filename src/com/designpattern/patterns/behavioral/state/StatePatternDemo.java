package com.designpattern.patterns.behavioral.state;

public class StatePatternDemo {
    public static void run() {
        TrafficLightContext trafficLight = new TrafficLightContext();

        // Simulate state changes
        trafficLight.changeState(); // Red -> Green
        trafficLight.changeState(); // Green -> Yellow
        trafficLight.changeState(); // Yellow -> Red
        trafficLight.changeState(); // Red -> Green
    }
}