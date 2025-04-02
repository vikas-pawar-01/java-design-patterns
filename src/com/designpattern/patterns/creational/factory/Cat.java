package com.designpattern.patterns.creational.factory;

public class Cat implements Animal {
  @Override
  public void speak() {
    System.out.println("Meow! Meow!");
  }
}