package com.designpattern.patterns.creational.factory;

public class Dog implements Animal {
  @Override
  public void speak() {
    System.out.println("Woof! Woof!");
  }
}