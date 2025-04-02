package com.designpattern.solid.isp;

public class InterfaceSegregationDemo {
  public static void run() {
    Worker human = new HumanWorker();
    human.work();
  }
}