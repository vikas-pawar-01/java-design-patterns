package com.designpattern.patterns.behavioral.state;

public class YellowState implements TrafficLightState {
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Traffic Light is YELLOW. Slow down!");
        context.setState(new RedState()); // Transition to Red
    }
}