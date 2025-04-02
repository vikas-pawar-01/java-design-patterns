package com.designpattern.patterns.structural.bridge;

public class BridgePatternDemo {
  public static void run() {
    Shape redCircle = new Circle(new Red());
    Shape blueRectangle = new Rectangle(new Blue());

    redCircle.draw();
    blueRectangle.draw();
  }
}