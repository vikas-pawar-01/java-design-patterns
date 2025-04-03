package com.designpattern.patterns.behavioral.command;

public class FanOffCommand implements Command {
  private Fan fan;

  public FanOffCommand(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    fan.turnOff();
  }

  @Override
  public void undo() {
    fan.turnOn();
  }
}