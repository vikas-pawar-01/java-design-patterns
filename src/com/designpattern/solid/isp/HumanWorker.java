package com.designpattern.solid.isp;

public class HumanWorker implements Worker, Eater {
  @Override
  public void work() {
    System.out.println("Human is working.");
  }

  @Override
  public void eat() {
    System.out.println("Human is eating.");
  }
}