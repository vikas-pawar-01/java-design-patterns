package com.designpattern.patterns.creational.abstractfactory;

public class FactoryProvider {
  public static AbstractFactory<?> getFactory(String choice) {
    if ("Shape".equalsIgnoreCase(choice)) {
      return new ShapeFactory();
    } else if ("Color".equalsIgnoreCase(choice)) {
      return new ColorFactory();
    }
    return null;
  }
}