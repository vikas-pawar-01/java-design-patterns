package com.designpattern.patterns.creational.factory;

public class Lion implements Animal {
  @Override
  public void speak() {
    System.out.println("Roar!");
  }
}