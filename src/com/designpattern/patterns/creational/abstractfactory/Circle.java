package com.designpattern.patterns.creational.abstractfactory;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }
}