package com.designpattern.solid.ocp;

import java.util.List;

public class ShapeCalculator {
  public double calculateTotalArea(List<Shape> shapes) {
    return shapes.stream().mapToDouble(Shape::calculateArea).sum();
  }
}