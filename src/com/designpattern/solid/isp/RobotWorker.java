package com.designpattern.solid.isp;

public class RobotWorker implements Worker {
  @Override
  public void work() {
    System.out.println("Robot is working.");
  }
}