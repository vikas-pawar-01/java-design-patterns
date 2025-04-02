package com.designpattern.patterns.prototype;

public class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
    this.setType("Circle");
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public Circle clone() {
    return new Circle(this.radius);
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + "]";
  }
}