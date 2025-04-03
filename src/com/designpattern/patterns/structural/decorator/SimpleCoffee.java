package com.designpattern.patterns.structural.decorator;

public class SimpleCoffee implements Coffee {
  @Override
  public String getDescription() {
    return "Simple Coffee";
  }

  @Override
  public double getCost() {
    return 5.0; // Base cost of coffee
  }
}