package com.designpattern.patterns.creational.abstractfactory;

public class ShapeFactory implements AbstractFactory<Shape> {
  @Override
  public Shape create(String type) {
    if ("Circle".equalsIgnoreCase(type)) {
      return new Circle();
    } else if ("Rectangle".equalsIgnoreCase(type)) {
      return new Rectangle();
    }
    return null;
  }
}