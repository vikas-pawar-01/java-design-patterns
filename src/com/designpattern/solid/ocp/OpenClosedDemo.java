package com.designpattern.solid.ocp;

import java.util.Arrays;

public class OpenClosedDemo {
  public static void run() {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    ShapeCalculator calculator = new ShapeCalculator();
    System.out.println("Total Area: " + calculator.calculateTotalArea(Arrays.asList(circle, rectangle)));
  }
}