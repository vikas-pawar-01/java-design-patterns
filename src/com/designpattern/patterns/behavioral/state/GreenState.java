package com.designpattern.patterns.behavioral.state;

public class GreenState implements TrafficLightState {
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Traffic Light is GREEN. Go!");
        context.setState(new YellowState()); // Transition to Yellow
    }
}