package com.designpattern.patterns.structural.bridge;

public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  public abstract void draw();
}