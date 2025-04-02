package com.designpattern.patterns.structural.bridge;

public class Rectangle extends Shape {
  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.print("Drawing Rectangle with ");
    color.applyColor();
  }
}