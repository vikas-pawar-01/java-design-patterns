package com.designpattern.patterns.factory;

public class Cat implements Animal {
  @Override
  public void speak() {
    System.out.println("Meow! Meow!");
  }
}