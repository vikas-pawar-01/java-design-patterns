package com.designpattern.patterns.behavioral.state;

public class RedState implements TrafficLightState {
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Traffic Light is RED. Stop!");
        context.setState(new GreenState()); // Transition to Green
    }
}