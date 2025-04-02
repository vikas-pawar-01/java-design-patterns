package com.designpattern.patterns.creational.prototype;

public class PrototypePatternDemo {
  public static void run() {
    ShapeRegistry registry = new ShapeRegistry();

    // Add prototypes to the registry
    registry.addShape("Circle", new Circle(10));
    registry.addShape("Rectangle", new Rectangle(5, 8));

    // Clone shapes from the registry
    Shape clonedCircle = registry.getShape("Circle");
    Shape clonedRectangle = registry.getShape("Rectangle");

    System.out.println("Cloned Circle: " + clonedCircle);
    System.out.println("Cloned Rectangle: " + clonedRectangle);
  }
}