package com.designpattern.patterns.prototype;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    this.setType("Rectangle");
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public Rectangle clone() {
    return new Rectangle(this.width, this.height);
  }

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }
}