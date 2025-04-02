package com.designpattern.patterns.structural.bridge;

public class Blue implements Color {
  @Override
  public void applyColor() {
    System.out.println("Applying Blue color");
  }
}