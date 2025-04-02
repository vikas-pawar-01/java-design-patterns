package com.designpattern.patterns.creational.abstractfactory;

public class AbstractFactoryPatternDemo {
  public static void run() {
    // Get Shape Factory
    AbstractFactory<Shape> shapeFactory = (AbstractFactory<Shape>) FactoryProvider.getFactory("Shape");
    Shape circle = shapeFactory.create("Circle");
    circle.draw();

    Shape rectangle = shapeFactory.create("Rectangle");
    rectangle.draw();

    // Get Color Factory
    AbstractFactory<Color> colorFactory = (AbstractFactory<Color>) FactoryProvider.getFactory("Color");
    Color red = colorFactory.create("Red");
    red.fill();

    Color blue = colorFactory.create("Blue");
    blue.fill();
  }
}