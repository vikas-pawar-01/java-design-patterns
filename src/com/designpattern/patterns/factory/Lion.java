package com.designpattern.patterns.factory;

public class Lion implements Animal {
  @Override
  public void speak() {
    System.out.println("Roar!");
  }
}