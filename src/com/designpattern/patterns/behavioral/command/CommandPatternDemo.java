package com.designpattern.patterns.behavioral.command;

public class CommandPatternDemo {
  public static void run() {
    Light light = new Light();
    Fan fan = new Fan();

    Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);
    Command fanOn = new FanOnCommand(fan);
    Command fanOff = new FanOffCommand(fan);

    RemoteControl remote = new RemoteControl();

    // Turn on the light
    remote.setCommand(lightOn);
    remote.pressButton();

    // Turn off the light
    remote.setCommand(lightOff);
    remote.pressButton();

    // Turn on the fan
    remote.setCommand(fanOn);
    remote.pressButton();

    // Undo the fan action
    remote.pressUndo();
  }
}