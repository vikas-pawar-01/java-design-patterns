package com.designpattern.patterns.behavioral.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        // Initial state is Red
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void changeState() {
        currentState.handleState(this);
    }
}